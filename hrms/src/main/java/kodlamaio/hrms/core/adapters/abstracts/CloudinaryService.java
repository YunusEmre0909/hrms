package kodlamaio.hrms.core.adapters.abstracts;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.DataResult;

public interface CloudinaryService {
	
	 public DataResult<Map> uploadImage(MultipartFile imageFile);

}
