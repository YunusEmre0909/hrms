package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="images")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="image_id")
	private int imageId;
	
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="creation_date")
	private LocalDate creationDate;
	
	
	@ManyToOne
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCv jobSeekerCv;
	
	@ManyToOne
	@JoinColumn(name="job_seeker_id")
	private  JobSeeker jobSeeker;

}
