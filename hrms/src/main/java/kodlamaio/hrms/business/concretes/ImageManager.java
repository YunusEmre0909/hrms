package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.core.adapters.abstracts.CloudinaryService;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private CloudinaryService cloudinaryService;
	private ImageDao imageDao;
	
	@Autowired
	public ImageManager(CloudinaryService cloudinaryService, ImageDao imageDao) {
		super();
		this.cloudinaryService = cloudinaryService;
		this.imageDao = imageDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result add(Image image, MultipartFile imageFile) {
		Map<String, String> imageUpload=this.cloudinaryService.uploadImage(imageFile).getData();
		image.setImageUrl(imageUpload.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Resim eklendi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"Resimler Listelendi");
	}

}
