package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş deneyimi eklendi");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"İş deneyimleri listelendi");
	}

}
