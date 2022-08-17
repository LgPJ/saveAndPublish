package com.siif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siif.service.SaveTokenService;

@RestController
@RequestMapping("/v1")
public class SaveToken {
	
	@Autowired
	SaveTokenService saveTokenService;
	
	@PostMapping("/call")
	private String callSaveToken() throws Exception{
		
		if(saveTokenService.TOKEN == null) {
			
			return saveTokenService.save();
			
		} else {
			
			return saveTokenService.TOKEN;
		}
		// Token obtained to communicate with services
		 

	}
}
