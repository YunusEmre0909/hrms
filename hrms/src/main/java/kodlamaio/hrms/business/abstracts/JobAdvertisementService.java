package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	Result makePassife(int id);

	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getByActiveStatus();
	
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	
	DataResult<List<JobAdvertisement>> getByEmployerId(int employerId);
	
}
