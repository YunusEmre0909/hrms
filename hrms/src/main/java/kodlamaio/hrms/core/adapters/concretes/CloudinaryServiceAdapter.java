package kodlamaio.hrms.core.adapters.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorDataResult;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.adapters.abstracts.CloudinaryService;

@Service
public class CloudinaryServiceAdapter implements CloudinaryService{
	
	
	private final Cloudinary cloudinary;

    public CloudinaryServiceAdapter() {
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("cloud_name","db02ifokt" );
        valuesMap.put("api_key", "665334923914385" );
        valuesMap.put("api_secret","KMXybCiIzpg9iQ9xpJEKIhOODOk" );
        cloudinary = new Cloudinary(valuesMap);
    
	}


	
	@Override
	public DataResult<Map> uploadImage(MultipartFile imageFile) {
		
		File file;
		try {
			file=convert(imageFile);
			Map<String,String> result  = (Map<String,String>)cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
			return new SuccessDataResult<>(result);
		} catch (IOException e) {
		
			e.printStackTrace();
			return new ErrorDataResult<>("Resim yüklenemdi");
		}
		
	 }
	
	private File convert(MultipartFile imageFile) throws IOException {
		
		File file=new File(imageFile.getOriginalFilename());
		FileOutputStream stream = new FileOutputStream(file);
		stream.write(imageFile.getBytes());
		stream.close();
		return file;
	}

}
