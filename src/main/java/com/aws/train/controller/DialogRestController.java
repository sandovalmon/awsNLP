package com.aws.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.train.domain.ViewDialogRequest;
import com.aws.train.service.GetResponseService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@RestController
public class DialogRestController {

	@Autowired
	private GetResponseService service;
	
	@RequestMapping("/getResponse")
	public MessageResponse getResponse(ViewDialogRequest request){
		return service.getResponse(request);
	}
	
}
