package com.panda.sbAjax.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sbAjax
 * @description:
 * @author: jiangzq
 * @create: 2019-10-29 09:47
 **/
@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {
    @RequestMapping("/hello")
    public String say() {
        return "{'message ':'springBoot 你好','message2','你好Ajax‘}";
    }
}
