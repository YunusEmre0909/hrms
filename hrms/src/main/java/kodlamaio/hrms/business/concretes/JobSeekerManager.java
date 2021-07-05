package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.verification.abstracts.JobSeekerEmailCheckService;
import kodlamaio.hrms.verification.abstracts.MernisService;


@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	private JobSeekerEmailCheckService emailCheckService;
	private MernisService mernisService;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,
			JobSeekerEmailCheckService emailCheckService,MernisService mernisService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailCheckService=emailCheckService;
		this.mernisService=mernisService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"İş arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if (emailCheckService.emailCheck(jobSeeker)==true 
				&& mernisService.mernisCheck(jobSeeker)== true) {
			this.jobSeekerDao.save(jobSeeker);

			return new SuccessResult("İş arayan eklendi");
		}
		return new ErrorResult("email doğrulamsı yapılamadı");
	}

}
