package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.ApprovedUserByPersonel;

public interface ApprovedUserByPersonService {
	
	DataResult<List<ApprovedUserByPersonel>> getAll();

}
