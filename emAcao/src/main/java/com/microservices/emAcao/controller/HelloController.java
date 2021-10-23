package com.microservices.emAcao.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hello")
public class HelloController {

    @RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
    public String hello(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return  String.format("{\"message\":\"Hello %s %s\"}",firstName,lastName);
    }
}
