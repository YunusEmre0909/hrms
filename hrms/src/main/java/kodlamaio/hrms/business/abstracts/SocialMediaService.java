package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	
	Result add(SocialMedia socialMedia);
	
	DataResult<List<SocialMedia>> getAll();

}
