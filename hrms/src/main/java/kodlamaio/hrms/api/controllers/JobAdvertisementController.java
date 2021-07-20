package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	@GetMapping("/getByActiveStatus")
	public DataResult<List<JobAdvertisement>> getByActiveStatus(){
		return this.jobAdvertisementService.getByActiveStatus();
	}
	@GetMapping()
	public DataResult<List<JobAdvertisement>> getAllSortedByDate(){
		return this.jobAdvertisementService.getAllSortedByDate();
	}
	@GetMapping("/getByEmployerId")
	public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int employerId){
		return this.jobAdvertisementService.getByEmployerId(employerId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@PostMapping("makePassive")
	public Result makePassife(@RequestParam int id) {
		return this.jobAdvertisementService.makePassife(id);
	}
}
