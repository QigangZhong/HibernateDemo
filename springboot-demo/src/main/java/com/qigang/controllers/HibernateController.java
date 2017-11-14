package com.qigang.controllers;

import com.qigang.model.User;
import com.qigang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/hibernate")
@EnableAutoConfiguration
public class HibernateController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("getUserById")
    @ResponseBody
    public User getUserById(Long id) {
        User u = userRepository.findOne(id);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + id);
        return u;
    }

    @RequestMapping("saveUser")
    @ResponseBody
    public void saveUser() {
        User u = new User();
        u.setUserName("wan");
        u.setAddress("江西省上饶市鄱阳县");
        u.setBirthDay(new Date());
        u.setSex("男");
        userRepository.save(u);
    }


}