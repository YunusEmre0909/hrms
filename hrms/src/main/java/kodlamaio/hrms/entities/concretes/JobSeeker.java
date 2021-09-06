package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobSeekerCvs"})
public class JobSeeker{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="ıdentity_number")
	private String ıdentityNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="year_of_birth")
	private Date yearOfBirth;
	
	@Column(name="is_verified_by_email")
	private boolean isVerifiedByEmail;
	
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCv> jobSeekerCvs;

}
