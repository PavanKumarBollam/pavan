package com.example.dao;

import java.util.ArrayList;

import com.example.model.Trainee;

public interface TraineeDao {

	int addTrainee(Trainee trainee);

	int updateTrainee(Trainee trainee);

	int deleteTrainee(int id);

	ArrayList<Trainee> getAll();

	Trainee getById(int id);

}
