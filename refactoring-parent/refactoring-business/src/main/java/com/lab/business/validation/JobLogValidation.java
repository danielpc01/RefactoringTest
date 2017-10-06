package com.lab.business.validation;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.common.dto.LogTrackingDTO;
import com.lab.common.enums.LogTypeEnum;
import com.lab.common.enums.MessageTypeEnum;

@Component
@PropertySource(value={"classpath:business-messages.properties"})
public class JobLogValidation {

	@Value( "${messages.joblog.empty}" )
	private String messagesJoblogEmpty;
	
	@Value( "${messages.joblog.invalid.config}" )
	private String messagesJoblogInvalidConf;
	
	@Value( "${messages.joblog.invalid.msgType}" )
	private String messagesJoblogInvalidMsgType;
	
	public  boolean isRegisterLog(LogTrackingDTO tracking) throws RefactoringBusinessException{
		if(StringUtils.isBlank(tracking.getMessage())){
			throw new RefactoringBusinessException(messagesJoblogEmpty);
		}
		
		else if(!LogTypeEnum.contains(tracking.getLogType())){
			throw new RefactoringBusinessException(messagesJoblogInvalidConf);
		}
		
		else if(!MessageTypeEnum.contains(tracking.getMessageType())){
			throw new RefactoringBusinessException(messagesJoblogInvalidMsgType);
		}
		return true;
		
		
	}
}
