package com.bekov.dz70_name.controller;

import com.bekov.dz70_name.model.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class NameController implements INameController {

    @Override
    public List<User> getNameList() {

        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(4, "user4");
        User user5 = new User(5, "user5");

        return Arrays.asList(user1,user2,user3,user4,user5);
    }
}
