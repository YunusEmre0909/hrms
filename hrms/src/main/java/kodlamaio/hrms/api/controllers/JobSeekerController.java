package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekerController {
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/*add")
	public Result add(JobSeeker jobSeeker) {
	
		return this.jobSeekerService.add(jobSeeker);
	}
	@GetMapping("/getByJobSeekerId")
	public DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId){
		
		return this.jobSeekerService.getByJobSeekerId(jobSeekerId);
	}

}
