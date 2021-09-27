package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	
	Result add(Image image,MultipartFile  imageFile);
	
	DataResult<List<Image>> getAll();

}
