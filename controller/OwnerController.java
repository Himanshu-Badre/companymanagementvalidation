package TechTeam.companymanagementvalidation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TechTeam.companymanagementvalidation.dto.OwnerRequest;
import TechTeam.companymanagementvalidation.entity.Owner;
import TechTeam.companymanagementvalidation.exception.UserNotFoundException;
import TechTeam.companymanagementvalidation.repository.OwnerRepository;
import TechTeam.companymanagementvalidation.service.OwnerService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	
	@PostMapping("/signup")
	public ResponseEntity<Owner> saveOwner(@RequestBody @Valid OwnerRequest ownerRequest){
		return new ResponseEntity<>(ownerService.saveOwner(ownerRequest),HttpStatus.CREATED);
		//return ownerService.saveowner(ownerRequest);
	}
	
	
//	@GetMapping("/findAll")
//	public ResponseEntity<List<Owner>> fondOwner(){
//		return ResponseEntity.ok(ownerService.findallowner());
//	}
//	
//	@GetMapping("/findbyid/{id}")
//	public ResponseEntity<Owner> getOwner(@PathVariable Long id) throws UserNotFoundException{
//		return ResponseEntity.ok(ownerService.getowner(id));
//	}
}
