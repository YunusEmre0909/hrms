package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seeker_cvs")
public class JobSeekerCv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@OneToMany(mappedBy = "jobSeekerCv")
	private List<School> schools;
	
	@OneToMany(mappedBy = "jobSeekerCv")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy = "jobSeekerCv")
	private List<ForeignLanguage> foreignLanguages;
	
	@OneToMany(mappedBy = "jobSeekerCv")
	private List<Technology> technologies;
	
	@OneToMany(mappedBy = "jobSeekerCv")
	private List<SocialMedia> socialMedias;

	@OneToMany(mappedBy = "jobSeekerCv")
	private List<Image> images;
}
