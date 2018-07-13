package com.test.WSRest.controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        model.put("name", "login");
        return "Search a user by ID: http://localhost:8080/users/1234 \n Or retrive the list of users: http://localhost:8080/users/list";
    }

  /*  @RequestMapping(value = "/login/{name, password}", method = RequestMethod.GET)
    public ResponseEntity<Object> showLoggedUser(@PathVariable String userId, String password) {
            loginService.retriveUser(name, password);
        return new ResponseEntity(HttpStatus.OK);
    }*/

}