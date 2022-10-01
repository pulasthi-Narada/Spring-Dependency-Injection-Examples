package lk.pulasthi.sfgdi.controllers;

import lk.pulasthi.sfgdi.services.GreetingService;

public class PropertyInjectedController {

   public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
