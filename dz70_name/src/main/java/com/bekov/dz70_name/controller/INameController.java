package com.bekov.dz70_name.controller;

import com.bekov.dz70_name.model.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface INameController {

    @GetMapping("/names")
    List<User> getNameList();
}
