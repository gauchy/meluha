package com.meluha.persistence.exception;

import com.meluha.common.Persistence;
import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class PersistenceRuntimeException extends RuntimeException implements Persistence
{
	Loggable log = LoggingHelper.getLogger(PersistenceRuntimeException.class);
	PersistenceRuntimeException(Throwable e)
	{
		if(LoggingConstants.log_persistence_exception)
			log.error(e);
	}
	PersistenceRuntimeException(String errorString)
	{
		if(LoggingConstants.log_persistence_exception)
			log.error(errorString);
	}
}
