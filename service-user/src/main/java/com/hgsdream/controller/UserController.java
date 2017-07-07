package com.hgsdream.controller;

import com.hgsdream.entity.User;
import com.hgsdream.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;

/**
 * Created by Hong on 2017/7/4.
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    /**
     * 不能使用info作为路径，无法访问到，应该是默认的某个系统值
     * @param info
     * @return
     */
    @RequestMapping(value = "/infor")
    public String userInfo(@RequestParam String info){
        return "the info ="+info;
    }

    @PostMapping(value = "/user/register")
    public String register(){
         return "1";
    }

    @GetMapping(value = "/user/information")
    public String information(){
        User user = userService.selectUserById(1);
        logger.info("user information = ",user);
        return user.toString();
    }

    @GetMapping(value = "user/all")
    @ResponseBody
    public List<User> list(){
        List<User> list = userService.selectAllUser();
        return list;
    }

}
