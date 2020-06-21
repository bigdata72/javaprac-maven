package org.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		
		LOGGER.info("hello there .. with maven build ");
		LOGGER.debug("With debug");
		LOGGER.debug("some more logging");
		LOGGER.debug("yet some more");
	}
}
