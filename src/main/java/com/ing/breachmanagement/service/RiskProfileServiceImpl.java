package com.ing.breachmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.RiskDto;
import com.ing.breachmanagement.dto.RiskProfileDetailsDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.entity.Role;
import com.ing.breachmanagement.repository.BreachRepository;
import com.ing.breachmanagement.repository.RoleRepository;

@Service
public class RiskProfileServiceImpl implements RiskProfileService{
@Autowired
BreachRepository breachRepository;
@Autowired
RoleRepository roleRepository;
	@Override
	public RiskProfileDetailsDto getDetails(Integer roleId) {
	
		  RiskProfileDetailsDto riskProfileDetailsDtos = new   RiskProfileDetailsDto();
		List<Role> role= roleRepository.findByroleId(roleId);
	
		String roleType=null;
		String mail=null;
		for(Role role1:role)
		{
			mail=role1.getEmail();
		roleType=role1.getRoleType();
		}
		List<Breach> breaches= breachRepository.findByRiskProfile(roleType);

		List<RiskDto> dto=new ArrayList<RiskDto>();
		
		
			
			for(Breach breach :breaches)
			{
			RiskDto dto1=new RiskDto();
			dto1.setBreachCategory("bus");
			dto.add(dto1);
			
				
				}
		
		
	riskProfileDetailsDtos.setData(dto);
	riskProfileDetailsDtos.setMessage("hello");
	riskProfileDetailsDtos.setStatus("success");
	riskProfileDetailsDtos.setStatusCode(200);
			
		return riskProfileDetailsDtos;
			}
		
		
	
		
		
}

