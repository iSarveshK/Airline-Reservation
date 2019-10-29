package com.airline.test;



import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airline.model.User;
import com.airline.service.UserService;

public class TestRegister {

	
	@Test
	public void checkUser(){
		
		User u = new User();
		u.setFirstName("Maujrul");
		u.setLastName("Ansari");
		u.setEmail("majrul@lti.com");
		u.setPassword("maj@12K");
		u.setSecurityAnswerUser("oreo");
		u.setPhone(2136652326);
		u.setDateOfBirth(LocalDate.now());
		u.setSecurityQuestionUser("sdfdsfsd");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		UserService service = ctx.getBean(UserService.class);
		//service.register(u);
		
		
		EntityManagerFactory emf = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(u);
		tx.commit();
		em.close();
	}
	
}
