package com.project.hotel.service.repositories;

import com.project.hotel.service.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo  extends JpaRepository<Hotel, String> {
}
