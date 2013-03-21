package com.meluha.business.exception;

import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class BusinessException extends Exception 
{
	Loggable log = LoggingHelper.getBusinessLogger(BusinessException.class);
	public BusinessException(Throwable e)
	{
		if(LoggingConstants.log_business_exception)
			log.error(e);
	}
	public BusinessException(String exceptionString)
	{
		if(LoggingConstants.log_business_exception)
			log.error(exceptionString);
	}
	
}
