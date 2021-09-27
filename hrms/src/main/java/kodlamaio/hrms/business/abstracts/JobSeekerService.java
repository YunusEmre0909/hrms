package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId);
}
