package lk.pulasthi.sfgdi.controllers;

import lk.pulasthi.sfgdi.services.GreetingService;

@org.springframework.stereotype.Controller
public class Controller {
   private final GreetingService greetingService;

    public Controller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        return greetingService.sayGreeting();
    }
}
