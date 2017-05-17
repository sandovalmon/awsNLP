package com.aws.train.service;

import com.aws.train.domain.ViewDialogRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public interface GetResponseService {
	public MessageResponse getResponse(ViewDialogRequest request);
}
