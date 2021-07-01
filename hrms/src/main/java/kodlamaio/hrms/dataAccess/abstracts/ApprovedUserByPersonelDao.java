package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ApprovedUserByPersonel;

	public interface ApprovedUserByPersonelDao extends JpaRepository<ApprovedUserByPersonel, Integer>{

}
