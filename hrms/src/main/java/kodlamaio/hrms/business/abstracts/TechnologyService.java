package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Technology;

public interface TechnologyService {
	
	Result add(Technology technologyy);
	DataResult<List<Technology>> getAll();

}
