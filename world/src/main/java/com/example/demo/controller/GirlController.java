package com.example.demo.controller;

import com.example.demo.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2017/12/10.
 */
@RestController
public class GirlController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/usertemp/{id}")
    public Girl findById(@PathVariable int id){
        return this.restTemplate.getForObject("http://localhost:8000/find/"+id,Girl.class);
    }
}
