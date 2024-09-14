package com.sbproject.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	String fname;
	String lname;
	String uname;
	String mail;
	String pass;
	String cpass;
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public Admin(Long id, String fname, String lname, String uname, String mail, String pass, String cpass) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.mail = mail;
		this.pass = pass;
		this.cpass = cpass;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", mail=" + mail
				+ ", pass=" + pass + ", cpass=" + cpass + "]";
	}
	
}
