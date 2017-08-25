package cn.rmitec.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception{
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	DataSource dataSource = applicationContext.getBean(DataSource.class);
    	Connection connection = dataSource.getConnection();
    	connection.close();
    	System.out.println("Oracle start success");
    }
}
