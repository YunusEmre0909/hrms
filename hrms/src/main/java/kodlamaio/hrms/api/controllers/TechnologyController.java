package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	
	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Technology technology) {
		return this.technologyService.add(technology);
	}
	@GetMapping("/getAlll")
	public DataResult<List<Technology>> getAll(){
		return this.technologyService.getAll();
	}

}
