package com.sbproject.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String fname;
	String lname;
	String phone;
	String mail;
	String passw;
	String cpassw;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public String getCpassw() {
		return cpassw;
	}
	public void setCpassw(String cpassw) {
		this.cpassw = cpassw;
	}
	public User(Long id, String fname, String lname, String phone, String mail, String passw, String cpassw) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.mail = mail;
		this.passw = passw;
		this.cpassw = cpassw;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", mail=" + mail
				+ ", passw=" + passw + ", cpassw=" + cpassw + "]";
	}
	
	
}
