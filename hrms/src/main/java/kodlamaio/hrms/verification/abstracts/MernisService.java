package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface MernisService {
	
	boolean mernisCheck(JobSeeker jobSeeker);
}
