package com.infy.utility;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggingAspect {

	private Logger logger=LogManager.getLogger(this.getClass());

	public void logDaoException(Exception exception){

	}

	public void logServiceException(Exception exception){
		
		
	}


}
