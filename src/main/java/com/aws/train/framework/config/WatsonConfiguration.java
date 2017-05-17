package com.aws.train.framework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aws.train.framework.property.ConversationProperties;
import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;

@Configuration
public class WatsonConfiguration {
	
	@Autowired
	private ConversationProperties property;
	
	@Bean
	public ConversationService conversation(){
		ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2017_02_03);
		service.setUsernameAndPassword(property.getUsername(), property.getPassword());
		
		return service;
	}

}
