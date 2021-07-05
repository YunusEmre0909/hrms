package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerEmailCheckService {

	boolean emailCheck(Employer employer);
}
