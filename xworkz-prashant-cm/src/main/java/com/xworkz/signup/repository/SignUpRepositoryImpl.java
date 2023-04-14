package com.xworkz.signup.repository;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.signup.entity.SignUpEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SignUpRepositoryImpl implements SignUpRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public SignUpRepositoryImpl() {
		log.info("created no-arg in " + getClass().getSimpleName());
	}

	@Override
	public boolean save(SignUpEntity entity) {
		log.info("running save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(entity);
			entityTransaction.commit();
			return false;
		} finally {
			entityManager.close();
		}

	}

	@Override
	public List<SignUpEntity> findAll() {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("find");
			List<SignUpEntity> list = query.getResultList();
			log.info("total list size found in repo" + list.size());
			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public Long findByUserName(String userName) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("userName");
			query.setParameter("userBy", userName);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			log.info("", value);
			return value;
		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByEmail(String email) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("email");
			query.setParameter("email", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			log.info("", value);
			return value;
		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByMobile(Long mobile) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("mobile");
			query.setParameter("mobile", mobile);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			log.info("" + value);
			return value;
		} finally {
			manager.close();
		}
	}

	@Override
	public SignUpEntity findByUserId(String userID) {
		log.info("running findByUserIdAndPassword");
		log.info("userID--"+userID);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("userID");
			query.setParameter("user", userID);
			Object object = query.getSingleResult();
			SignUpEntity entity = (SignUpEntity) object;
			log.info("entity: ", entity);
			return entity;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean loginCount(String userID, int loginAttempts) {
		log.info("running loginCount");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("login");
			query.setParameter("userIDS", userID);
			query.setParameter("attempt", loginAttempts);
			query.executeUpdate();
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}

	}
	
	@Override
	public SignUpEntity resetPassword(String emailID) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("reset");
			query.setParameter("mail", emailID);
			Object object = query.getSingleResult();
			SignUpEntity entity = (SignUpEntity) object;
			log.info(""+entity);
			return entity;
		}finally {
			manager.close();
		}
	}

	@Override
	public boolean update(SignUpEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		}finally {
			manager.close();
		}
	}

	@Override
	public boolean updatePassword(String userID, String password, boolean rePassword, LocalTime expTime) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("updatePassword");
			query.setParameter("user", userID);
			query.setParameter("password", password);
			query.setParameter("rePassword", rePassword);
			query.setParameter("exp", expTime);
			query.executeUpdate();
			transaction.commit();
			return true;
		}finally {
			manager.close();
		}
	}

}
