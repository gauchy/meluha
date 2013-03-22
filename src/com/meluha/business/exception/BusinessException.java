package com.meluha.business.exception;

import com.meluha.common.Business;
import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class BusinessException extends Exception implements Business
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Loggable log = LoggingHelper.getLogger(BusinessException.class);
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
