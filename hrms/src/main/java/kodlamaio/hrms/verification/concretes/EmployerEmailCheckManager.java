package kodlamaio.hrms.verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.verification.abstracts.EmployerEmailCheckService;

@Service
public class EmployerEmailCheckManager implements EmployerEmailCheckService{

	@Override
	public boolean emailCheck(Employer employer) {
		employer.setVerifiedByEmail(true);
		if (employer.isVerifiedByEmail()==true) {
			System.out.println("email doğrulaması yapıldı");
			return true;
		}
		return false;
	}

}
