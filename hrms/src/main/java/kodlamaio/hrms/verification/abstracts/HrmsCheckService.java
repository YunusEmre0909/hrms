package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface HrmsCheckService {
	
	boolean hrmsCheck(Employer employer);
}
