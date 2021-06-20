package com.xworkz.fridege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.fridege.dto.FridegeDto;

public class FridegeDaoImple implements FridegeDao {

	private SessionFactory sessionFactory;

	public FridegeDaoImple(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveFridege(FridegeDto dto) {
		Session openSession = null;
		try {
			openSession = sessionFactory.openSession();
			openSession.getTransaction().begin();
			openSession.save(dto);
			openSession.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
		} finally {
			if (openSession != null) {
				System.out.println("openSession.closed... ");
			} else {
				System.out.println("openSession not closed...");
			}

		}

	}

}
