package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ApprovedUserByPersonService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.ApprovedUserByPersonelDao;
import kodlamaio.hrms.entities.concretes.ApprovedUserByPersonel;

@Service
public class ApprovedUserByPersonManager implements ApprovedUserByPersonService {
	
	private ApprovedUserByPersonelDao approvedUserByPersonelDao;

	@Autowired
	public ApprovedUserByPersonManager(ApprovedUserByPersonelDao approvedUserByPersonelDao) {
		super();
		this.approvedUserByPersonelDao = approvedUserByPersonelDao;
	}

	@Override
	public DataResult<List<ApprovedUserByPersonel>> getAll() { 
		
		return new SuccessDataResult<List<ApprovedUserByPersonel>>(this.approvedUserByPersonelDao.findAll(),"Personel tarafından onaylanan kullanıcılar listelendi");
	}

}
