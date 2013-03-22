package com.meluha.common.logging;

import com.meluha.business.logging.BusinessLogger;
import com.meluha.common.Business;
import com.meluha.common.FrameworkException;
import com.meluha.common.Persistence;
import com.meluha.common.UI;
import com.meluha.persistence.logging.PersistenceLogger;
import com.meluha.ui.logging.UILogger;

public class LoggingHelper 
{
	public static Loggable getLogger(Class clazz)
	{
		if(UI.class.isAssignableFrom(clazz))
			return new UILogger(clazz);
		else if(Business.class.isAssignableFrom(clazz))
			return new BusinessLogger(clazz);
		else if(Persistence.class.isAssignableFrom(clazz))
			return new PersistenceLogger(clazz);
		else
			throw new FrameworkException("Entity not supported for logging");
	}
	
}
