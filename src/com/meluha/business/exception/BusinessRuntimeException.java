package com.meluha.business.exception;

import com.meluha.common.Business;
import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class BusinessRuntimeException  extends RuntimeException implements Business
{
	Loggable log = LoggingHelper.getLogger(BusinessRuntimeException.class);
	public BusinessRuntimeException(Throwable e)
	{
		if(LoggingConstants.log_business_exception)
			log.error(e);
	}
	public BusinessRuntimeException(String exceptionString)
	{
		if(LoggingConstants.log_business_exception)
			log.error(exceptionString);
	}
}
