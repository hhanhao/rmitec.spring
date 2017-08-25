package cn.rmitec.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld2 {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld2.class);
		logger.info("hello world2");
		logger.info("logger.name:{}", logger.getName());
//		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//		ch.qos.logback.classic.Logger logger2 = lc.getLogger(HelloWorld2.class);
//		System.out.println("HelloWorld2.main()" + logger2.iteratorForAppenders());
//	    StatusPrinter.print(lc);
	}
}
