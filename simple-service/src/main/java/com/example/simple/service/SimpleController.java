package com.example.simple.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class SimpleController {

    static List<List<Long>> list = new ArrayList<>();

    @GetMapping("greet")
    public String greet() {

        return "Hello, World!";
    }

    @GetMapping("test")
    public Response test() {

        return Response.populateWithRandomValues();
    }

    @GetMapping("add")
    public int add() {
        Random random = new Random();
        List<Long> longs = random.longs(1024).mapToObj(Long::valueOf).toList();
        list.add(longs);
        return list.size();
    }

}
