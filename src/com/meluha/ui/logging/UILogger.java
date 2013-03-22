package com.meluha.ui.logging;

import java.io.File;

import com.meluha.common.UI;
import com.meluha.common.logging.AbstractLogger;
import com.meluha.common.logging.LoggingConstants;

public class UILogger extends AbstractLogger implements UI
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
