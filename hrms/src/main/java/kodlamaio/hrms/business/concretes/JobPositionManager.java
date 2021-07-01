package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorDataResult;
import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{

	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Pozisyonlar listelendi ");
	}

	@Override
	public Result add(JobPosition jobPosition) {
			
		if (jobPositionDao.getByName(jobPosition.getName()) != null) {
			return new ErrorResult("İş pozisyonu sistemde mevcut");
		}
		this.jobPositionDao.save(jobPosition);
		
		return new SuccessResult("iş pozisyonu eklendi : " + jobPosition.getName());
	}

	@Override
	public DataResult<JobPosition> getByJobName(String name) {

		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByName(name));
	}





}
