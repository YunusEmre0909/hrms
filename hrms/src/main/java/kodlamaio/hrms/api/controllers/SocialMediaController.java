package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/socialMedias")
public class SocialMediaController {
	
	private SocialMediaService socialMediaService;

	@Autowired
	public SocialMediaController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody SocialMedia socialmedia) {
		return this.socialMediaService.add(socialmedia);
	}
	@GetMapping("/getAll")
	public DataResult<List<SocialMedia>> getAll(){
		return this.socialMediaService.getAll();
	}

}
