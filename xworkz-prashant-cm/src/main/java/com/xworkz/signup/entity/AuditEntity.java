package com.xworkz.signup.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
@MappedSuperclass
@Data
public abstract class AuditEntity implements Serializable 
{
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "updatedBy")
	private String updatedBy;
	
	@Column(name = "createdOn")
	private LocalDateTime createdOn;
	
	@Column(name = "updatedOn")
	private LocalDateTime updatedOn;

}
