package com.xworkz.tv.dao;

import java.lang.invoke.ClassSpecializer.Factory;

import com.xworkz.tv.entity.TvChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TvChannelDAOImpl implements TvChannelDAO {

	@Override
	public void saveChannel(TvChannel channel) {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		EntityTransaction tx = null;

		try {
			factory = Persistence.createEntityManagerFactory("tv");
			entityManager = factory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(channel);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}

	}

	@Override
	public void getChannel() {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		EntityTransaction tx = null;

		try {
			factory = Persistence.createEntityManagerFactory("tv");
			entityManager = factory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			TvChannel channel=entityManager.find(TvChannel.class ,1);
			System.out.println(channel.toString());
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
		
	}

	@Override
	public void getChannelById(Integer channelId) {
		TvChannel tvChannel=null;
		EntityManager entityManager=null;
		EntityManagerFactory factory=null;
		try {
			entityManager= factory.createEntityManager();
			tvChannel=entityManager.find(TvChannel.class, channelId);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
