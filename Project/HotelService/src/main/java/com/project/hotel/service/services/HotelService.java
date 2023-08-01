package com.project.hotel.service.services;

import com.project.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getALL();

    Hotel getHotel(String id);
}
