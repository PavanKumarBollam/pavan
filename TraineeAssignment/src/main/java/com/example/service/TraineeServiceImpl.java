package com.example.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.TraineeDao;
import com.example.model.Trainee;


@Component("TraineeDetailsService")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{

	
	@Autowired
	TraineeDao dao;
	
	@Override
	public Trainee getById(int id) {
		return dao.getById(id);
	}

	@Override
	public int addTrainee(Trainee trainee) {
		return dao.addTrainee(trainee);
	}

	@Override
	public int updateTrainee(Trainee trainee) {

		return dao.updateTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int id) {

		return dao.deleteTrainee(id);
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	

}
