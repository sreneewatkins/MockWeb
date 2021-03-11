package com.tts.mockweb.controller;

import com.tts.mockweb.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
So far, our HomeController is simple and has no dependencies. We could make it
more realistic by introducing an extra component to store the greeting (perhaps
in a new controller).
 */
@Controller
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {

        this.service = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody
    String greeting() {
        return service.greet();
    }

}//end GreetingController class
