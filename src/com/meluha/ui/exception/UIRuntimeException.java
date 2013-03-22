package com.meluha.ui.exception;

import com.meluha.common.UI;
import com.meluha.common.logging.Loggable;
import com.meluha.common.logging.LoggingConstants;
import com.meluha.common.logging.LoggingHelper;

public class UIRuntimeException extends RuntimeException implements UI
{
	Loggable log = LoggingHelper.getLogger(UIRuntimeException.class);
	UIRuntimeException(Throwable e)
	{
		if(LoggingConstants.log_ui_exception)
			log.error(e);
	}
	UIRuntimeException(String errorString)
	{
		if(LoggingConstants.log_ui_exception)
			log.error(errorString);
	}
}
