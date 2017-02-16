package com.timberland.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignatureController {
	
	@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
	@RequestMapping(value = "signatures", method = RequestMethod.POST, produces = "application/json")
	public String setSignatures() {
		return "Method not yet implemented";
	}
}
