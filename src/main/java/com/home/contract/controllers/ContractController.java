package com.home.contract.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.contract.dto.Contract;

/** 
 * @author sergio alexandre
 * @since 25 jan 2018 23:45
 *
 */
@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {

	public static final String CONTRACT_BASE_URI = "svc/v1/contract";
	
	@RequestMapping(value = "{contractNumber}/{contractNumber2}")
	public Contract getContract(@PathVariable final int contractNumber, @PathVariable final int contractNumber2) {
		
		Contract contract = new Contract();
		
		contract.setId(contractNumber);
		
		contract.setName("sergio");
		
		return contract;
		
	}
	
}
