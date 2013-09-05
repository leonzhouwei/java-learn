package edu.xidian.sei.grade2011.zhouwei.java.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			logger.debug("debug");
			logger.info("info");
			Thread.sleep(60000);
		}
	}
}
