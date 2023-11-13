package TechTeam.companymanagementvalidation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;



public class OwnerRequest {
	
	
	@NotNull(message= "Name Should Not be null")
	private String name;
	
	@NotNull(message="Designation Should Not Be Null")
	private String designation;
	
	@NotNull(message="Location Should Not Be Null")
	private String location;
	
	@Email(message="Email Should Not Be Null")
	private String email;
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobno;
	
	@NotNull(message="Salary Should Not Be Null")
	private Long salary;
	
	@Min(21)
	@Max(60)
	private int age;
	
	@NotNull(message="Education Should Not Be Null")
	private String education;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public OwnerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
