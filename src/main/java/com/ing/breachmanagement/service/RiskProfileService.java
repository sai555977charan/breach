package com.ing.breachmanagement.service;


import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.RiskProfileDetailsDto;

@Service
public interface RiskProfileService {

	RiskProfileDetailsDto getDetails(Integer roleId);

}
