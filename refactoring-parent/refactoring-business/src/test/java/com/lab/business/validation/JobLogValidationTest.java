package com.lab.business.validation;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.common.dto.LogTrackingDTO;
import com.lab.common.enums.LogTypeEnum;


@ContextConfiguration(locations = {"classpath:spring_config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JobLogValidationTest {

	@Autowired
	private JobLogValidation jobLogValidation;
	
	@Value( "${messages.joblog.empty}" )
	private String messagesJoblogEmpty;
	
	@Value( "${messages.joblog.invalid.config}" )
	private String messagesJoblogInvalidConf;
	
	@Value( "${messages.joblog.invalid.msgType}" )
	private String messagesJoblogInvalidMsgType;
	
	
	@Test
	public void isRegisterLogAndMessageBlankTest(){
		try {
			LogTrackingDTO tracking = new LogTrackingDTO();
			jobLogValidation.isRegisterLog(tracking);
			
		} catch (RefactoringBusinessException e) {
			Assert.assertEquals(messagesJoblogEmpty,e.getMessage());
		}
	}
	
	@Test
	public void isRegisterLogAndLogTypeIsNullTest(){
		try {
			LogTrackingDTO tracking = new LogTrackingDTO();
			tracking.setMessage("Mensaje");
			jobLogValidation.isRegisterLog(tracking);
			
		} catch (RefactoringBusinessException e) {
			Assert.assertEquals(messagesJoblogInvalidConf,e.getMessage());
		}
	}
	
	@Test
	public void isRegisterLogAndMessageTypeIsNullTest(){
		try {
			LogTrackingDTO tracking = new LogTrackingDTO();
			tracking.setMessage("Mensaje");
			tracking.setLogType(LogTypeEnum.CONSOLE.getId());
			jobLogValidation.isRegisterLog(tracking);
			
		} catch (RefactoringBusinessException e) {
			Assert.assertEquals(messagesJoblogInvalidMsgType,e.getMessage());
		}
	}
}
