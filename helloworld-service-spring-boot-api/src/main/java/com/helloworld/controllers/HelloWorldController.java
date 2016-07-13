package com.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * HelloWorld controller class for the services
 *
 * Created by randell on 7/13/16.
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    Map<String,String> hello() {
        Map<String, String> msg = new HashMap<String, String>();
        msg.put("msg", "Hello World");
        return msg;
    }
}
