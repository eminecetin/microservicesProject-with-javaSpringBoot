package com.microservice.openai.Controller;

import com.microservice.openai.Service.WelcomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Welcome")
public class WelcomeController {

    private final WelcomeService welcomeService;


    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }//dependency injection

    @PostMapping("/sayhi")
    public String gratings(@RequestBody String name) {
        return welcomeService.sayhi(name);
    }

    @GetMapping("/{name}")
    public String sayhi(@PathVariable(name="name")String name){
        return welcomeService.sayhi(name);
    }

}