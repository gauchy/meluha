package com.meluha.common.logging;

import com.meluha.business.logging.BusinessLogger;
import com.meluha.persistence.logging.PersistenceLogger;
import com.meluha.ui.logging.UILogger;

public class LoggingHelper 
{
	public static Loggable getUILogger(Class clazz)
	{
		
		return new UILogger(clazz);
	}
	public static Loggable getBusinessLogger(Class clazz)
	{
		
		return new BusinessLogger(clazz);
	}
	public static Loggable getPersistenceLogger(Class clazz)
	{
		
		return new PersistenceLogger(clazz);
	}
}
