package com.meluha.persistence.logging;
import java.io.File;

import com.meluha.common.Persistence;
import com.meluha.common.logging.AbstractLogger;
import com.meluha.common.logging.LoggingConstants;

public class PersistenceLogger extends AbstractLogger implements Persistence
{

	public PersistenceLogger(Class clazz)
	{
		super(clazz);
	}
	
	@Override
	public File getLogProperties()
	{
		return new File(LoggingConstants.PERSISTENCE_LOG_DETAILS);
	}

}
