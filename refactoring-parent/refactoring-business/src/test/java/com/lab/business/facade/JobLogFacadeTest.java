package com.lab.business.facade;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.lab.business.exception.RefactoringBusinessException;
import com.lab.common.dto.LogTrackingDTO;
import com.lab.common.enums.LogTypeEnum;
import com.lab.common.enums.MessageTypeEnum;
import com.lab.common.enums.TransactionResultEnum;


@ContextConfiguration(locations = {"classpath:spring_config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JobLogFacadeTest {

	@Autowired
	private JobLogFacade jobLogFacade; 
	
	@Test
	public void registerLogWithDataBaseAndInfoTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.DATABASE.getId());
			tracking.setMessageType(MessageTypeEnum.INFO.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithConsoleAndInfoTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.CONSOLE.getId());
			tracking.setMessageType(MessageTypeEnum.INFO.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithFileAndInfoTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.INFO.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void registerLogWithDataBaseAndWarningTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.DATABASE.getId());
			tracking.setMessageType(MessageTypeEnum.WARNING.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithConsoleAndWarningTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.CONSOLE.getId());
			tracking.setMessageType(MessageTypeEnum.WARNING.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithFileAndWarningTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.WARNING.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void registerLogWithDataBaseAndErrorTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.DATABASE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithConsoleAndErrorTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.CONSOLE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogWithFileAndErrorTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage("Success Transaction");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogMessageIsNullTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage(null);
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogMessageIsEmptyTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage("");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void registerLogMessageisBlankTest(){
		LogTrackingDTO tracking = new LogTrackingDTO();
		try {
			tracking.setLogType(LogTypeEnum.FILE.getId());
			tracking.setMessageType(MessageTypeEnum.ERROR.getId());
			tracking.setMessage(" ");
			int result=jobLogFacade.registerLog(tracking);
			Assert.assertTrue(result == TransactionResultEnum.SUCCESS.getValue());
			
		} catch (RefactoringBusinessException e) {
			e.printStackTrace();
		}
		
	}
	
}
