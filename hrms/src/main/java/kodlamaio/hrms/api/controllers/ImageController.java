package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	
	private ImageService imageService;
	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@PostMapping("/add")
	public Result add(@RequestPart MultipartFile imageFıle,@RequestParam("jobSeekerId") int jobSeekerId ){
		return this.imageService.add(imageFıle, jobSeekerId);
		
	}
	@GetMapping("/getAll")
	public DataResult<List<Image>> getAll(){
		
		return this.imageService.getAll();
	}

}
