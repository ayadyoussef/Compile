package com.test.WSRest.service;

import com.test.WSRest.model.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserService {

    //Mock users
    User user = new User("1234", "Pippo", new Date(), "Köln");
    User user2 = new User("12345", "Pluto", new Date(), "Dortmund");
    User user3 = new User("123456", "Duck", new Date(), "Bochum");

    public User retriveUser(String userId){
        if(userId.equals(user.getId()) || userId.equals(user2.getId()) || userId.equals(user3.getId()))
            return user;
        return null;
    }

    public List<User> retriveUsers() {
        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }
}