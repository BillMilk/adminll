package com.smart.controller;

import com.smart.entity.Boys;
import com.smart.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2017/12/10.
 */
@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;
    @PostMapping("/boy")
    public Boys findByQuery(@RequestParam("name") String name){
        return this.boyRepository.findByName(name);
    }
}
