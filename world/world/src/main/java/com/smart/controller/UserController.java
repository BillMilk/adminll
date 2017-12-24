package com.smart.controller;


import com.smart.entity.Girl;
import com.smart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2017/12/2.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/find/{id}")
    public Girl findById(@PathVariable int id){
        Girl findOne=this.userRepository.findOne(id);
        return findOne;
    }
    @PostMapping("/insert")
    public Girl insertById(@RequestParam("balance") String balance
                            ,@RequestParam("name") String name){
        Girl g =new Girl();
        g.setBalance(balance);
        g.setName(name);
        return this.userRepository.save(g);
    }
    @PostMapping("/findByName")
    public Girl findByName(@RequestParam("name") String name){
        return this.userRepository.findByName(name);
    }
    @PostMapping("/findAll")
    public List<Girl> findAll(){
        return this.userRepository.findAll();
    }
}
