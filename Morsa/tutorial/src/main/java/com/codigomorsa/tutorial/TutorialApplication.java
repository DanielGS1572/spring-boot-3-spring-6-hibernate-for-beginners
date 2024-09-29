package com.codigomorsa.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

	private static Logger logger = LoggerFactory.getLogger(TutorialApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		logger.trace("Trace Msg");	//Trace esta un nivel por debajo de debug,
		// por lo que si en el properties se configura a nivel debug, Trace no aparecerá en logs
		logger.debug("Debug Msg");
		logger.info("Info Msg");
		logger.warn("Warning Msg");
		logger.error("Error Msg");
	}

}
