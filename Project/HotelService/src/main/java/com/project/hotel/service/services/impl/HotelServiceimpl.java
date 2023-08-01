package com.project.hotel.service.services.impl;

import com.project.hotel.service.entities.Hotel;
import com.project.hotel.service.exceptions.ResourceNotFoundException;
import com.project.hotel.service.repositories.HotelRepo;
import com.project.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class HotelServiceimpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getALL() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotel(String Id) {
        return hotelRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found on server !! : " + Id));
    }
}
