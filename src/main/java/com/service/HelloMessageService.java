package com.service;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    private String name = "Prashant";

    public String getMessage() {
        return getMessage(name);
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }
}
