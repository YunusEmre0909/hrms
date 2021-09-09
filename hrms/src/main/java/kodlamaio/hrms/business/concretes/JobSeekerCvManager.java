package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerCvDao;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

@Service
public class JobSeekerCvManager implements JobSeekerCvService{
	
	private  JobSeekerCvDao jobSeekercvDao;
	
	@Autowired
	public JobSeekerCvManager(JobSeekerCvDao jobSeekercvDao) {
		super();
		this.jobSeekercvDao = jobSeekercvDao;
	}


	@Override
	public DataResult<List<JobSeekerCv>> getAll() {
		
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekercvDao.findAll(),"CV'ler listelendi");
	}


	@Override
	public DataResult<List<JobSeekerCv>> getByJobSeeker_Id(int jobSeekerId) {
		
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekercvDao.getByJobSeeker_JobSeekerId(jobSeekerId),"iş arayan Cv'si getirildi");
	}

}
