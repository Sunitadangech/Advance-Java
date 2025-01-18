package com.jspiders.springboot.apientity;


import com.jspiders.springboot.apicontroller.ApiController;
import com.jspiders.springboot.apiservice.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/ApiController")
public class ApiEntity {

    @Autowired
    private ApiService weatherService;

    
    @PostMapping("/add")
    public ResponseEntity<String> addWeather(@RequestBody ApiController weather) {
        ApiService.addController(apicontroller);
        return ResponseEntity.ok("Weather details added successfully!");
    }
}
