package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="position_count")
	private int positonCount;
	
	@Column(name="date_of_upload")
	private Date dateOfUpload;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition ;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer ;
	

}
