package com.project.user.service.repositories;

import com.project.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String>{

}
