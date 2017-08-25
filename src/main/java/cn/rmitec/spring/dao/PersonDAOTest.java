package cn.rmitec.spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class PersonDAOTest {
	
	@Autowired
	private  PersonDAO personDAO;
//	@BeforeClass
//	public static void setContent() throws SQLException {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		DataSource dataSource = applicationContext.getBean(DataSource.class);
//		personDAO  = new PersonDAO();
//		personDAO.setConnection(dataSource.getConnection());
//		
//	}
	
	
	@Test
	public void testUpdate() {
		System.out.println("=================");
		personDAO.update();
	}

}
