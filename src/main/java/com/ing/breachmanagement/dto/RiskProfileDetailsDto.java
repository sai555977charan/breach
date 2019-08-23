package com.ing.breachmanagement.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class RiskProfileDetailsDto {
	List<RiskDto> data;
	private String message;
	private String status;
	private Integer statusCode;
	

}
