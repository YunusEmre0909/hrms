package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.Staff;

public interface StaffService {

	DataResult<List<Staff>> getAll();
}
