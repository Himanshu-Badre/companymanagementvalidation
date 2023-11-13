package TechTeam.companymanagementvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TechTeam.companymanagementvalidation.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{
	
	Owner findByOwnerId(Long id);

}
