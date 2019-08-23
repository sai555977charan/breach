package com.ing.breachmanagement.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RiskDto {
	private String	franchise;
	private String	bussinessArea;
	private String breachCategory;
	private String	repoteeName;
	private String	repoteeEmailId;
	private String	reason;
    private Integer	ticketNumber;
	private String	breachStatus;
	private String	ticketStatus;
}
