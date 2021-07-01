package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ApprovedUserByPersonService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.concretes.ApprovedUserByPersonel;

@RestController
@RequestMapping("/api/approveduserByPersonels")
public class ApprovedUsrByPersonelController {

	private ApprovedUserByPersonService approvedUserByPersonService;

	@Autowired
	public ApprovedUsrByPersonelController(ApprovedUserByPersonService approvedUserByPersonService) {
		super();
		this.approvedUserByPersonService = approvedUserByPersonService;
	}
	@GetMapping("/getall")
	public DataResult<List<ApprovedUserByPersonel>> getAll(){
		
		return this.approvedUserByPersonService.getAll();
	}
}
