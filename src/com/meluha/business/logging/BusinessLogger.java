package com.meluha.business.logging;

import java.io.File;

import com.meluha.common.Business;
import com.meluha.common.logging.AbstractLogger;
import com.meluha.common.logging.LoggingConstants;

public class BusinessLogger extends  AbstractLogger implements Business
{

	public BusinessLogger(Class clazz)
	{
		super(clazz);
	}
	
	@Override
	public File getLogProperties()
	{
		return new File(LoggingConstants.BUSINESS_LOG_DETAILS);
	}

}
