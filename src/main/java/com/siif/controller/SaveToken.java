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
	
	private String SAVED_TOKENS;
	
	
	@PostMapping("/call")
	private String callSaveToken() throws Exception{
		
		// Token obtained to communicate with services
		return SAVED_TOKENS = saveTokenService.save();

	}
}
