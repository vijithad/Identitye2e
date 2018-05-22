package com.identity.e2e.helpers;
import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	public static void startTestCase(){
		Log.info("Started Test case: ");
	}

	public static void endTestCase(){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
		Log.info(message);
	}

}