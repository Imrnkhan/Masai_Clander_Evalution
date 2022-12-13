package com.example.masai_clander.controller;

import com.example.masai_clander.Model.User;
import com.example.masai_clander.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class usercontrolle {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @ResponseBody
    public ResponseEntity<String>createuser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<String>("user added", HttpStatus.CREATED);
    }



    @GetMapping("/user")
    public ResponseEntity<List<User>>getAllUser(){
        List<User> emp = userService.findAllUser();
        return new ResponseEntity<List<User>>(emp,HttpStatus.FOUND);
    }




    @GetMapping("/user/{id}")
    @ResponseBody
    public ResponseEntity<User> getUserbyid(@PathVariable("id")int id){
        User emp = userService.findUserById(id);
        return new ResponseEntity<>(emp,HttpStatus.FOUND);
    }




    @PutMapping("/user/{id}")
    public ResponseEntity<String>updateUser(@PathVariable("id")int id){
        return new ResponseEntity<String>("user updated",HttpStatus.CREATED);

    }



    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteuserbyid(@PathVariable("id")int id){
        userService.deleteUser(id);
        return new ResponseEntity<String>("user deleted by id",HttpStatus.OK);
    }
}
