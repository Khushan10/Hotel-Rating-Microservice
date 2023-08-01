package com.project.rating.service.services;

import com.project.rating.service.entities.Rating;

import java.util.List;


public interface RatingService {
    Rating createRating(Rating rating);

    List<Rating> getRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
