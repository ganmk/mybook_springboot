package org.mybook.controller;

import org.mybook.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /*@GetMapping("/home1")
    public RespBean login() {
        return RespBean.error("尚未登录2，请登录!");
    }*/

   /* @GetMapping({"/home","/home1"})
    public String index() {

        return "home";
    }*/
}
