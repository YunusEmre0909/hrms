package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import lombok.Data;

@Data
public class JobSeeker {
	
	private int jobSeekerId;
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private LocalDate birthDate;
	


}
