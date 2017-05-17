package com.aws.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DialogViewController {
	
	@RequestMapping(value = "/showDialog", method = RequestMethod.GET)
	public String showDialog() {
		return "dialog";
	}

}
