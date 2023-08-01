package com.project.user.service;

import com.project.user.service.entities.Rating;
import com.project.user.service.external.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

	@Test
	void createRating(){
		Rating rating = Rating.builder().rating(7).userId("").hotelId("").feedback("Good Services.").build();
		Rating savedRating = ratingService.createRating(rating);
		System.out.println("Created New Rating");
	}

}
