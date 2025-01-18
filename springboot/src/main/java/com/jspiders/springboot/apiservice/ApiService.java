package com.jspiders.springboot.apiservice;


import com.jspiders.springboot.apicontroller.ApiController;
import com.jspiders.springboot.apirepository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApiService {

    @Autowired
    private ApiRepository apiRepository;

    public ApiController addWeather(ApiController apiController) {
        return ApiRepository.save(apiController);
    }

    public Optional<ApiController> getWeather(String date, String time) {
        return ApiRepository.findByDateAndTime(date, time);
    }
}
