package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

@RestController
@RequestMapping("api/jobSeekerCv")
public class JobSeekerCvController {

	private JobSeekerCvService jobSeekerCvService;
	
	@Autowired
	public JobSeekerCvController(JobSeekerCvService jobSeekerCvService) {
		super();
		this.jobSeekerCvService = jobSeekerCvService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeekerCv>> getAll(){
		return this.jobSeekerCvService.getAll();
	}
	@GetMapping("/getByJobSeeker=Id")
	public DataResult<List<JobSeekerCv>> getByJobSeeker_Id(@RequestParam int JobSeekerId){
		return this.jobSeekerCvService.getByJobSeeker_Id(JobSeekerId);
	}
}
