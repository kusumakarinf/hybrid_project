package Log4j;

import org.apache.log4j.Logger;


public class Logging 
{
	static final Logger logger = Logger.getLogger(Logging.class);

	public static void main(String[] args) 
	{
		
		logger.info("Main function is started");
		logger.debug("this is warning message");
		logger.error("this is error message");
		logger.fatal("this is fatal error");
		
	

	}

}
