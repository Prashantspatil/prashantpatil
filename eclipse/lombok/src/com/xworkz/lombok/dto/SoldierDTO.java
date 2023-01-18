package com.xworkz.lombok.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDTO extends AbstractAuditDTO{
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20, message = "name between 3 & 20 chars")
	private String name;
	@Min(value=21, message = "age >21")
	@Max(value=35, message = "age <35")
	private int age;
	@NotNull
	@NotBlank
	@Size(min=3,max=20, message = "rank between 3 & 20 chars")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=20, message = "position between 3 & 20 chars")
	private String position;

}
