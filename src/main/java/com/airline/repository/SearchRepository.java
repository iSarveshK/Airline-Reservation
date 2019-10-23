package com.airline.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
@Repository
public class SearchRepository {
	
		@PersistenceContext
		private EntityManager entityManager;
		/*
		@Override
		public void updateFlight(Person p) {
			Session session = this.sessionFactory.getCurrentSession();
			session.update(p);
			logger.info("Person updated successfully, Person Details="+p);
		}
		
		public List<FlightSchedule> listFlights() {
			String jpql= "select fs from FlightSchedule fs";
			Query q=entityManager.createQuery(jpql);
			List<FlightSchedule> fs = q.getResultList();
			return fs;
		}
/*
		@Override
		public Person getPersonById(int id) {
			Session session = this.sessionFactory.getCurrentSession();		
			Person p = (Person) session.load(Person.class, new Integer(id));
			logger.info("Person loaded successfully, Person details="+p);
			return p;
		}

		@Override
		public void removePerson(int id) {
			Session session = this.sessionFactory.getCurrentSession();
			Person p = (Person) session.load(Person.class, new Integer(id));
			if(null != p){
				session.delete(p);
			}
			logger.info("Person deleted successfully, person details="+p);
		}

	}
*/
}
