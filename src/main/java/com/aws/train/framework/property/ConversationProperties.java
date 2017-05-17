package com.aws.train.framework.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/properties/conversation.properties")
public class ConversationProperties extends AbstractProperties<ConversationProperties>{

	public ConversationProperties() {
		super(ConversationProperties.class);
	}
	
	@Value("${uname}")
	public String username;
	
	@Value("${password}")
	public String password;
	
	@Value("${workspace}")
	public String workspace;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getWorkspace() {
		return workspace;
	}
}
