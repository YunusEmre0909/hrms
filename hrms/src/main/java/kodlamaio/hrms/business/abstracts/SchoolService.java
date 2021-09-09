package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.School;

public interface SchoolService {
	
	Result add(School school);
	
	DataResult<List<School>> getAll();

}
