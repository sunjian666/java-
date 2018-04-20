package com.example.javathread.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simpleThread")
@Api(value = "simpleThread API", description = "一个简单的多线程程序")
public class simpleThread {

}
