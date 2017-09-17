package com.jisoo.spring.controller;

import com.jisoo.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTH: JiSoo Yoon
 * MODIFY:
 * DESC:
 * TODO:
 */

@Controller
public class IndexController {
    private static List<User> userList = new ArrayList<User>();

    //Initialize the list with some data for index screen
    static {
        userList.add(new User("Bill", "Gates"));
        userList.add(new User("Steve", "Jobs"));
        userList.add(new User("Larry", "Page"));
        userList.add(new User("Sergey", "Brin"));
        userList.add(new User("Larry", "Ellison"));
    }


    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/ftl")
    public String ftlTest(@ModelAttribute("model") ModelMap model) {

        model.addAttribute("userList", userList);

        return "test";
    }

}
