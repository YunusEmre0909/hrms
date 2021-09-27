package kodlamaio.hrms.core.adapters.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorDataResult;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.adapters.abstracts.CloudinaryService;

@Service
public class CloudinaryServiceAdapter implements CloudinaryService{
	
	
	 Cloudinary cloudinary;
	
	
	public CloudinaryServiceAdapter() {
		cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "db02ifokt",
				"api_key", "665334923914385",
				"api_secret", "KMXybCiIzpg9iQ9xpJEKIhOODOk"
				));
	}


	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public DataResult<Map> uploadImage(MultipartFile imageFile) {
		
		Map<String, String> resultMap;
		try {
			resultMap = (Map<String,String>)cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<>(resultMap);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return new ErrorDataResult<Map>();
	 }

}
