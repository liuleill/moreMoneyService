package com.hardcore.accounting.controllers;

import com.hardcore.accounting.model.Greeting;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class helloController {
    private AtomicLong counter = new AtomicLong();
    @GetMapping(path = "version/greeting")
    public Greeting sayHello(@RequestParam("name") String name) {
        return new Greeting(counter.incrementAndGet(),String.format("Hello,%s",name));
    }
}
