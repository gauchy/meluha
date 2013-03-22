package com.meluha.ui.exception;

import com.meluha.common.UI;
import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class UIException extends Exception implements UI
{
	Loggable log = LoggingHelper.getLogger(UIException.class);
	UIException(Throwable e)
	{
		if(LoggingConstants.log_ui_exception)
			log.error(e);
	}
	UIException(String errorString)
	{
		if(LoggingConstants.log_ui_exception)
			log.error(errorString);
	}
}
