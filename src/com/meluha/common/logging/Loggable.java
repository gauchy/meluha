package com.meluha.common.logging;

public interface Loggable 
{
	void error(Throwable e);
	void error(String errorString);
	void info(String infoString);
	void debug(String debugString);
	void trace(String traceString);
	void warn(String warnString);
}
