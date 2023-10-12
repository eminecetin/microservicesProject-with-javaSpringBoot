package com.microservice.openai.Service.impl;

import com.microservice.openai.Service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceimpl implements WelcomeService {

    @Override
    public String sayhi(String name) {
        return "Hello! "+ name;
    }
}
