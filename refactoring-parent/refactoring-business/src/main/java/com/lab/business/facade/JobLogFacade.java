package com.lab.business.facade;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.business.service.ConstantService;
import com.lab.business.service.TrackingService;
import com.lab.business.validation.JobLogValidation;
import com.lab.common.dto.LogTrackingDTO;
import com.lab.common.enums.ConstantFatherEnum;
import com.lab.common.enums.LogTypeEnum;
import com.lab.common.enums.TransactionResultEnum;
import com.lab.domain.entity.Constant;
import com.lab.domain.entity.LogTracking;

/***
 * 
 * @author Daniel Pena Cueva
 *
 */
@Component
public class JobLogFacade extends FacadeBase {
	
	private static final Logger LOG = Logger
			.getLogger(JobLogFacade.class);
	
	private final static Logger LOG_REPORT = Logger
			.getLogger("reportsLog");
	
	@Autowired
	private TrackingService trackingService;
	
	@Autowired
	private ConstantService constantService;
	
	@Autowired
	private JobLogValidation jobLogValidation;
	
	
	/***
	 * Method that register a log tracking<BR>
	 * 
	 * 
	 * @param tracking, Object DTO that have the information of Tracking, type <code>LogTrackingDTO</code>
	 * @return 0: Success, -1: ERROR
	 * @throws RefactoringBusinessException
	 */
	public int registerLog(LogTrackingDTO tracking) throws RefactoringBusinessException {
		int result=TransactionResultEnum.ERROR.getValue();
		if(jobLogValidation.isRegisterLog(tracking)){
		
			String today=DateFormatUtils.
			ISO_8601_EXTENDED_DATETIME_FORMAT.
			format(new Date());
			
			Constant constant = constantService.
					findByValue1AndFatherId(String.valueOf(tracking.getMessageType()), 
							new Long(ConstantFatherEnum.LOG_TYPE.getValue1()));
			
			String messageFormat=MESSAGE_FINAL.
					replace("{0}", constant.getValue2()).
					replace("{1}", today).
					replace("{2}", tracking.getMessage());
			
			switch(LogTypeEnum.get(tracking.getLogType())){
				case FILE:
					LOG_REPORT.info(messageFormat);
					result=TransactionResultEnum.SUCCESS.getValue();
					break;
				case CONSOLE:
					LOG.info(messageFormat);
					result=TransactionResultEnum.SUCCESS.getValue();
					break;
				case DATABASE:
					LogTracking trackingEntity = new LogTracking();
					trackingEntity.setMessage(messageFormat);
					trackingEntity.setCreatedBy(USER_LOGGIN_DEFAULT);
					trackingEntity.setDateCreated(new Date());
					trackingEntity.setConstant(constant);
					trackingService.saveTracking(trackingEntity);
					result=TransactionResultEnum.SUCCESS.getValue();
					break;
			}
		}
		return result;
	}
	
}
