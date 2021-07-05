package kodlamaio.hrms.verification.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.verification.abstracts.JobSeekerEmailCheckService;

@Service
public class JobSeekerEmailCheckManager implements JobSeekerEmailCheckService {

	@Override
	public boolean emailCheck(JobSeeker jobSeeker) {
		jobSeeker.setVerifiedByEmail(true);
		if (jobSeeker.isVerifiedByEmail()==true) {
			System.out.println("email doğrulaması yapıldı");
			return true;
		}
		return false;
	}
}
