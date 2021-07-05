package kodlamaio.hrms.verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.verification.abstracts.MernisService;

@Service
public class MernisManager implements MernisService{

	@Override
	public boolean mernisCheck(JobSeeker jobSeeker) {
		
		System.out.println("MernisDoğrulaması yapıldı");
		return true;
		
	}

}
