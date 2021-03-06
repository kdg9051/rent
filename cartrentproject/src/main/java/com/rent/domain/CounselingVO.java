package com.rent.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CounselingVO {
	
	private String counseling;
	private String id;
	private String car_id;
	private String option_name;
	private String color;
	private String name;
	private String address;
	private String tel;
	private String counseling_situation;
	private String month;
	private Timestamp counseling_date;

}
