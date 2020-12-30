package com.hyuseinmustafa.sfgdi.controllers;

import com.hyuseinmustafa.sfgdi.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
