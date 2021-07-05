package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
