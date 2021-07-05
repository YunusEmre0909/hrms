package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.verification.abstracts.EmployerEmailCheckService;
import kodlamaio.hrms.verification.abstracts.HrmsCheckService;

@Service
public class EmployerManager implements EmployerService{
	
	 private EmployerDao employerDao;
	 private EmployerEmailCheckService emailCheckService;
	 private HrmsCheckService hrmasCheckService;

	 @Autowired
	public EmployerManager(EmployerDao employerDao,
			EmployerEmailCheckService emailCheckService,HrmsCheckService hrmsCheckService) {
		super();
		this.employerDao = employerDao;
		this.emailCheckService=emailCheckService;
		this.hrmasCheckService=hrmsCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İşverenler Listelendi");
		
	}

	@Override
	public Result add(Employer employer) {
		
		if (emailCheckService.emailCheck(employer)==true && hrmasCheckService.hrmsCheck(employer)==true) {
			this.employerDao.save(employer);
			return new SuccessResult("iş veren eklendi");
			
		}
			return new ErrorResult("Email doğrulaması başarısız");

	}





}
