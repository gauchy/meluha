package com.meluha.ui.logging;

import java.io.File;

import com.meluha.common.logging.AbstractLogger;
import com.meluha.common.logging.LoggingConstants;

/**
 * 
 * @author Ashwini
 *Using log4j logging
 */
public class UILogger extends AbstractLogger 
{
	
	public UILogger(Class clazz)
	{
		super(clazz);
	}
	
	@Override
	public File getLogProperties()
	{
		return new File(LoggingConstants.UI_LOG_DETAILS);
	}
}
