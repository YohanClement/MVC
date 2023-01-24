package fr.formation.inti.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	@NotEmpty
	@Size(min=3, max=20 ,message="required")
	private String firstname;
	@NotEmpty
	@Size(min=3, max=20 ,message="required")
	private String lastname;
	@Size(min=3, max=20)
	private String rolename;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String input) throws ParseException {
		SimpleDateFormat startdate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = startdate.parse(input);
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", rolename=" + rolename + ", date="
				+ date + "]";
	}
	
	
	

}
