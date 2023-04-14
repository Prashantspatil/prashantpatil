package com.xworkz.signup.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "signup")
@NamedQuery(name = "find", query = "select ent from SignUpEntity ent")
@NamedQuery(name = "userName", query = "select count(*) from SignUpEntity ent where ent.userID=:userBy")
@NamedQuery(name = "mobile", query = "select count(*) from SignUpEntity ent where ent.mobile=:mobile")
@NamedQuery(name = "email", query = "select count(*) from SignUpEntity ent where ent.emailID=:email")
@NamedQuery(name = "userID", query = "select ent from SignUpEntity ent where ent.userID=:user")
@NamedQuery(name = "login", query = "update SignUpEntity ent set ent.loginAttempts=:attempt where ent.userID=:userIDS")
@NamedQuery(name = "reset", query = "select ent from SignUpEntity ent where ent.emailID=:mail")
@NamedQuery(name = "updatePassword", query = "update SignUpEntity ent set ent.password=:password ,ent.rePassword=:rePassword,ent.expTime=:exp where ent.userID=:user")

public class SignUpEntity extends AuditEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "userID", unique = true)
	private String userID;

	@Column(name = "emailID", unique = true)
	private String emailID;

	@Column(name = "password")
	private String password;

	@Column(name = "mobile", unique = true)
	private long mobile;

	@Column(name = "agreement")
	private boolean agreement;
	
	@Column(name = "loginAttempts")
	private int loginAttempts;
	
	private Boolean rePassword;
	
	@Column(name = "expTime")
	private LocalTime expTime;

}
