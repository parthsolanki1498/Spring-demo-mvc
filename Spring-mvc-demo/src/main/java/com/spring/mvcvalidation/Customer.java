package com.spring.mvcvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.mvcvalidation.annotation.CourseCode;

public class Customer {
	
	private String firstName;
	
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	
	
	@Pattern(regexp="^[0-9]{6}", message="only 6 digits allowed")
	private String postalCode;
	
	// Custom Annotation
	@CourseCode
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}
	
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}	
	
}
