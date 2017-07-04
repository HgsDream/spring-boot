package com.hgsdream.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hong on 2017/7/4.
 */
@RestController
public class UserController {

    /**
     * 不能使用info作为路径，无法访问到，应该是默认的某个系统值
     * @param info
     * @return
     */
    @RequestMapping(value = "/infor")
    public String userInfo(@RequestParam String info){
        return "the info ="+info;
    }
}
