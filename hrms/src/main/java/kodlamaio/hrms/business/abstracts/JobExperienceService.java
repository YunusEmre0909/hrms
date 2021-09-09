package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	Result add(JobExperience jobExperience);
	
	DataResult<List<JobExperience>> getAll();

}
