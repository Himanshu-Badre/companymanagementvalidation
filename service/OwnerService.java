package TechTeam.companymanagementvalidation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TechTeam.companymanagementvalidation.dto.OwnerRequest;
import TechTeam.companymanagementvalidation.entity.Owner;
import TechTeam.companymanagementvalidation.exception.UserNotFoundException;
import TechTeam.companymanagementvalidation.repository.OwnerRepository;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	public Owner saveOwner(OwnerRequest ownerRequest) {
		Owner owner = new Owner();

		owner.setName(ownerRequest.getName());
		owner.setAge(ownerRequest.getAge());
		owner.setDesignation(ownerRequest.getDesignation());
		owner.setEducation(ownerRequest.getEducation());
		owner.setEmail(ownerRequest.getEmail());
		owner.setLocation(ownerRequest.getLocation());
		owner.setMobno(ownerRequest.getMobno());
		owner.setSalary(ownerRequest.getSalary());

		return ownerRepository.save(owner);
	}


//	public List<Owner> findallowner() {
//		return ownerRepository.findAll();
//	}
//
//	public Owner getowner(Long id) throws UserNotFoundException {
//		Owner owner = ownerRepository.findByOwnerId(id);
//		
//		System.out.println(owner.getId());
//		
//		if (owner.getId() != null) {
//			
//			return owner;
//		} else {
//			throw new UserNotFoundException("No Owner Found With This Is : " + id);
//		}
//	}

}

//	public Owner saveowner(Owner owner) {
//		return ownerRepository.save(owner);
//	}
//	
//	public Owner findbyid(Long id) {
//		return ownerRepository.findById(id).get();
//	}
//	
//	public List<Owner> findAll() {
//		return ownerRepository.findAll();
//	}
//	
//	public void deletebyid(Long id) {
//		ownerRepository.deleteById(id);
//	}
//	
//	public void deleteAll(Owner owner) {
//		ownerRepository.deleteAll();
//	}
//	
//	public Owner updateOwner(Owner correctOwner, Long id) {
//		Owner owner=ownerRepository.findById(id).get();
//		
//		if(owner.getAge()!=0) {
//			owner.setAge(correctOwner.getAge());
//		}
//		if(owner.getDesignation()!=null) {
//			owner.setDesignation(correctOwner.getDesignation());
//		}
//		if(owner.getEducation()!=null) {
//			owner.setEducation(correctOwner.getEducation());
//		}
//		if(owner.getEmail()!=null) {
//			owner.setEmail(correctOwner.getEmail());
//		}
//		if(owner.getLocation()!=null) {
//			owner.setLocation(correctOwner.getLocation());
//		}
//		if(owner.getMobno()!=null) {
//			owner.setMobno(correctOwner.getMobno());
//		}
//		if(owner.getName()!=null) {
//			owner.setName(correctOwner.getName());
//		}
//		if(owner.getSalary()!=null) {
//			owner.setSalary(correctOwner.getSalary());
//		}
//		return ownerRepository.save(owner);
//	}
//}
