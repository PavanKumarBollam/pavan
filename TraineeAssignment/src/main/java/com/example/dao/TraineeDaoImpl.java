package com.example.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.Trainee;

@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		
		return 0;
	}

	@Override
	public int updateTrainee(Trainee trainee) {

		entityManager.merge(trainee);
		return 0;
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		entityManager.remove(getByid(id));
		return 0;
	}

	private Trainee getByid(int id) {
		// TODO Auto-generated method stub
		Trainee trainee=entityManager.find(Trainee.class, id);
		return trainee;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		Query query = (Query) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
		}

	@Override
	public Trainee getById(int id) {
		// TODO Auto-generated method stub
		Trainee trainee=entityManager.find(Trainee.class, id);
		return trainee;
	}

}
