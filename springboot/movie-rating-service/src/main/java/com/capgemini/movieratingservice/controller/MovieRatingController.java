package com.capgemini.movieratingservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieratingservice.service.Rating;
import com.capgemini.movieratingservice.service.UserRating;


@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	@GetMapping("/{userId}")
	public UserRating getMovieRatings(@PathVariable String userId) {
	
		if(userId.equals("pavan")) {
		List<Rating> ratings = Arrays.asList(new Rating(4,101), new Rating(5,102));
		UserRating userRating=new UserRating("pavan", ratings);
		return userRating;
	}
return null;
	}

}
