package com.meluha.persistence.exception;

import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class PersistenceException extends Exception
{
	Loggable log = LoggingHelper.getPersistenceLogger(PersistenceException.class);
	PersistenceException(Throwable e)
	{
		if(LoggingConstants.log_persistence_exception)
			log.error(e);
	}
	PersistenceException(String errorString)
	{
		if(LoggingConstants.log_persistence_exception)
			log.error(errorString);
	}
}
