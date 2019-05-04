package com.example.service;

import java.util.ArrayList;

import com.example.model.Trainee;

public interface TraineeService {

	Trainee getById(int id);
	int addTrainee(Trainee trainee);
	int updateTrainee(Trainee trainee);
	int deleteTrainee(int id);
	
	ArrayList<Trainee> getAll();

}
