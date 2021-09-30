package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.core.adapters.abstracts.CloudinaryService;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private CloudinaryService cloudinaryService;
	private ImageDao imageDao;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public ImageManager(CloudinaryService cloudinaryService, ImageDao imageDao,JobSeekerService jobSeekerService) {
		super();
		this.cloudinaryService = cloudinaryService;
		this.imageDao = imageDao;
		this.jobSeekerService=jobSeekerService;
	}

	
	@Override
	public Result add( MultipartFile imageFile,int jobSeekerId) {
		
		this.cloudinaryService.uploadImage(imageFile);
		var jobSeeker= this.jobSeekerService.getByJobSeekerId(jobSeekerId).getData();
		Image image=new Image();
		image.setJobSeeker(jobSeeker);
		this.imageDao.save(image);
		return new SuccessResult("Resim eklendi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"Resimler Listelendi");
	}

}
