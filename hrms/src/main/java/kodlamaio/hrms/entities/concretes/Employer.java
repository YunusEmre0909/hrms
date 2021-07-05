package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor 
public class Employer{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String  companyName;
	
	@Column(name="website_url")
	private String  websiteUrl;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_verified_by_email")
	private boolean isVerifiedByEmail;
	
	@Column(name="is_active")
	private boolean isActive;
}
