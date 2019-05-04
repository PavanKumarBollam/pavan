package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Trainee;
import com.example.service.TraineeService;



@RestController
public class TraineeController {

	

	@Autowired
	TraineeService TraineeDetailsService;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		TraineeDetailsService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody Trainee trainee) {
		TraineeDetailsService.updateTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int id) {
		TraineeDetailsService.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@GetMapping("/userById/{id}")
	public ResponseEntity getById(@PathVariable int id) {
		Trainee trainee=TraineeDetailsService.getById(id);
		return new ResponseEntity("success",HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ArrayList<Trainee> getAllProducts(){
		ArrayList<Trainee> trainee = TraineeDetailsService.getAll();
		return trainee;
	}
	
}

