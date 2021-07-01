package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();

}
