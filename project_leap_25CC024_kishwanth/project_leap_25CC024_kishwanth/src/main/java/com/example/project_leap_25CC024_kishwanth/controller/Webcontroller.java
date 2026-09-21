package com.example.project_leap_25CC024_kishwanth.controller;

import com.example.project_leap_25CC024_kishwanth.services.Webservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcontroller
{
    @Autowired
    Webservices webservices;
    @PostMapping("/data/write")
    String WriteData(String data)
    {
        return webservices.WriteData(data);
    }
    @GetMapping("data/get")
    String getData()
    {
        return webservices.readData();
    }
}
