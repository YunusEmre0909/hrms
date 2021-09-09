package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {
	
	Result add(City city);

	DataResult<List<City>> getAll();
}
