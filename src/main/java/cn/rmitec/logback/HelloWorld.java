package cn.rmitec.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class HelloWorld {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger("cn.rmitec.logback.HelloWorld");
		logger.debug("hello world");
		logger.info("logger.name:{}", logger.getName());
//		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//	    StatusPrinter.print(lc);
		MDC.put("taskname", "alic");
		logger.info("innnnn===============");
	}
}
