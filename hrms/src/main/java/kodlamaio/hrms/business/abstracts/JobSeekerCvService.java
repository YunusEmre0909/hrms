package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

public interface JobSeekerCvService {

	DataResult<List<JobSeekerCv>> findAll();
}
