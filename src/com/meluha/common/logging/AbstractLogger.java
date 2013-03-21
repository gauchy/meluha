package com.meluha.common.logging;

import java.io.File;

public abstract class AbstractLogger implements Loggable 
{
	
	public AbstractLogger(Class clazz)
	{
		
	}
	public void error(String errorString)
	{
		//TODO
	}
	public  void error(Throwable e)
	{
		//TODO
	}
	public  void info(String infoString)
	{
		//TODO
	}
	public void debug(String debugString)
	{
		//TODO
	}
	public void trace(String traceString)
	{
		//TODO
	}
	public void warn(String warnString)
	{
		//TODO
	}
	public File getLogProperties()
	{
		return new File(LoggingConstants.GENERIC_LOG_DETAILS);
	}
}
