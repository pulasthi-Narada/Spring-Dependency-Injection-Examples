package lk.pulasthi.sfgdi.controllers;

@org.springframework.stereotype.Controller
public class Controller {

    public String hello(){
        System.out.println("Hello world");
        return "hello";
    }
}
