package kodlamaio.hrms.verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.verification.abstracts.HrmsCheckService;

@Service
public class HrmsCheckManager implements HrmsCheckService {

	@Override
	public boolean hrmsCheck(Employer employer) {
		employer.setActive(true);
		if (employer.isActive()==true) {
			System.out.println("İş veren sistem personeli tarafından onaylandı");
			return true;
		}
		return false;
	}

}
