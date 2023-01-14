package com.xworkz.allegro.bean;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Value("monalisa")
	private String name;
	@Value("F")
	private char gender;
	@Value("21")
	private int age;
	@Value("california")
	private String place;
	private LocalDate dob;
	private LocalDate dod;
	@Value("chocolate")
	private String reason;
	@Value("www")
	private String father;
	@Value("xxx")
	private String mother;
	@Value("yyy")
	private String brother;
	@Value("zzz")
	private String sister;
	@Value("2")
	private int siblings;
	private String qualification;
	private String college;
	private String friend;
	private String area;
	private long pinCode;
	private boolean dangerous;
	private String time;
	private boolean committed;
	
    @Autowired
	public Ghost(@Qualifier("ghostDOB") LocalDate dob,@Qualifier("ghostDOD") LocalDate dod,@Qualifier("ghostQualification") String qualification,@Qualifier("ghostCollege") String college,@Qualifier("ghostFriend") String friend,@Qualifier("ghostArea") String area,
			@Qualifier("ghostPinCode")long pinCode,@Qualifier("ghostDangerous") boolean dangerous,@Qualifier("ghostTime") String time,@Qualifier("ghostCommitted"
					+ "") boolean committed) {
		super();
		this.dob = dob;
		this.dod = dod;
		this.qualification = qualification;
		this.college = college;
		this.friend = friend;
		this.area = area;
		this.pinCode = pinCode;
		this.dangerous = dangerous;
		this.time = time;
		this.committed = committed;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", age=" + age + ", place=" + place + ", dob=" + dob
				+ ", dod=" + dod + ", reason=" + reason + ", father=" + father + ", mother=" + mother + ", brother="
				+ brother + ", sister=" + sister + ", siblings=" + siblings + ", qualification=" + qualification
				+ ", college=" + college + ", friend=" + friend + ", area=" + area + ", pinCode=" + pinCode
				+ ", dangerous=" + dangerous + ", time=" + time + ", committed=" + committed + "]";
	}

}
