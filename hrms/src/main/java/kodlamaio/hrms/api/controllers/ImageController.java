package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Image;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	
	private ImageService imageService;
	private JobSeekerService jobSeekerService;
	@Autowired
	public ImageController(ImageService imageService, JobSeekerService jobSeekerService) {
		super();
		this.imageService = imageService;
		this.jobSeekerService = jobSeekerService;
	}
	@PostMapping("/add")
	public Result add(@RequestParam(value="jobSeekerId") int jobSeekerId,@RequestParam(value="imageFile") MultipartFile imageFıle) {
		
		JobSeeker jobSeeker=this.jobSeekerService.getByJobSeekerId(jobSeekerId).getData();
		Image image=new Image();
		image.setJobSeeker(jobSeeker);
		return this.imageService.add(image, imageFıle);
		
	}
	@GetMapping("/getAll")
	public DataResult<List<Image>> getAll(){
		
		return this.imageService.getAll();
	}

}
