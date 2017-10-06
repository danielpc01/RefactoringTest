package com.lab.business.facade;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/***
 * 
 * @author Daniel Pena Cueva
 *
 */
@Component
@PropertySource(value={"classpath:business-messages.properties"})
public abstract class FacadeBase {
	protected static final Long USER_LOGGIN_DEFAULT= 1L;
	
	@Value( "${messages.joblog.format.msg}" )
	protected String MESSAGE_FINAL;
	
	
}
