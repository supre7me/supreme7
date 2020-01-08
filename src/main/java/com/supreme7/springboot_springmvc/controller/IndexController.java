package com.supreme7.springboot_springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: supreme7
 * Date: Created in 21:34 20/01/07
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    private String indexController(){
        return "hello";
    }
}
