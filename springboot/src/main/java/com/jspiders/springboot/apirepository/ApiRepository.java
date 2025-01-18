package com.jspiders.springboot.apirepository;

import com.jspiders.springboot.apicontroller.ApiController;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiRepository extends JpaRepository<ApiController, String> {
    Optional<ApiController> findByDateAndTime(String date, String time);
}
