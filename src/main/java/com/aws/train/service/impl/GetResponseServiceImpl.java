package com.aws.train.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.train.domain.ViewDialogRequest;
import com.aws.train.framework.property.ConversationProperties;
import com.aws.train.service.GetResponseService;
import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@Service
public class GetResponseServiceImpl implements GetResponseService {
	
	@Autowired
	private ConversationService service;
	
	@Autowired
	private ConversationProperties property;

	@Override
	public MessageResponse getResponse(ViewDialogRequest request) {
		MessageRequest newMessage = null;
		
		if (request.getContext() != null) {
			Map<String, Object> mapContext = new Gson().fromJson(request.getContext().toString(), Map.class);
			newMessage = new MessageRequest.Builder().inputText(request.getMessage()).context(mapContext).build();
		} else {
			newMessage = new MessageRequest.Builder().inputText(request.getMessage()).build();
		}
		
		MessageResponse response = service.message(property.getWorkspace(), newMessage).execute();
		return response;
	}

}
