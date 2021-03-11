package com.tts.mockweb.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hola Mundo!";
    }

}//end GreetingService class
