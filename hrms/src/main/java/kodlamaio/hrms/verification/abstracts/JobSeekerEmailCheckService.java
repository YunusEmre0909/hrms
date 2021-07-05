package kodlamaio.hrms.verification.abstracts;


import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerEmailCheckService {

	boolean emailCheck(JobSeeker jobSeeker);
}
