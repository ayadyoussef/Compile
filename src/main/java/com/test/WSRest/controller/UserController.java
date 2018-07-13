package com.test.WSRest.controller;

import com.test.WSRest.model.User;
import com.test.WSRest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping("/users/{userId}")
        public ResponseEntity<Object> retrieveUser(@PathVariable String userId) {
                if(userService.retriveUser(userId) != null)
                        return new ResponseEntity<Object>(userService.retriveUser(userId), HttpStatus.OK);
                   else
                return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        @GetMapping("/users/list")
        public List<User> retrieveUsers() {
                return userService.retriveUsers();
        }

}
