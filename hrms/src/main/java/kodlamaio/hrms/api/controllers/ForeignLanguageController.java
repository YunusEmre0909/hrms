package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignLanguages")
public class ForeignLanguageController {
	
	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		return this.foreignLanguageService.add(foreignLanguage);
	}
	@GetMapping("/getAll")
	public DataResult<List<ForeignLanguage>> getAll(){
		return this.foreignLanguageService.getAll();
	}

}
