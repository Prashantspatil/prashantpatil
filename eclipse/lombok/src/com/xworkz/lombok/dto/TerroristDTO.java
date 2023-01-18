package com.xworkz.lombok.dto;
 
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public  class TerroristDTO extends AbstractAuditDTO{
	
	@NonNull
	@NotNull(message = "terroristname can't be null")
	@Size(min=3, max=20, message = "name is invalid")
	private String name;
    @Min(value=18)
    @Max(value=55)
	private int age;
    @NonNull
	@NotNull(message = "terroristcountry can't be null")
	@Size(min=3, max=20, message = "country is invalid")
	private String country;
	private boolean alive;
	private boolean imprison;
	@NonNull
	@NotNull(message = "terroristorganisation can't be null")
	@Size(min=3, max=20, message = "organisation is invalid")
	private String organisation;

}
