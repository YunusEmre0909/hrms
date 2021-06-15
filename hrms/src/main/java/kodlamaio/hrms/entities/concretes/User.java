package kodlamaio.hrms.entities.concretes;

import lombok.Data;

@Data
public class User {
	
	private int userId;
	private String email;
	private String password;
	private boolean isApproved;
	

}
