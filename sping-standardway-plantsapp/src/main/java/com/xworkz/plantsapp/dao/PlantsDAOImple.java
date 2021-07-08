package com.xworkz.plantsapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.plantsapp.entity.PlantsEntity;

@Repository
public class PlantsDAOImple implements PlantsDAO {

	@Autowired
	private SessionFactory factory;

	public PlantsDAOImple() {
		System.out.println("PlantsDAOImple : Object Created.. ");
	}

	@Override
	public boolean savePlantsDTO(PlantsEntity entity) {
		System.out.println("Invoking  savePlantsDTO");
		Session session = null;
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.saveOrUpdate(entity);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				System.out.println("Session Closed...");
				session.close();
			} else {
				System.out.println("Session not closed...");
			}
		}
		return false;
	}

}
