package com.example.project_leap_25CC024_kishwanth.services.impl;

import com.example.project_leap_25CC024_kishwanth.repository.Webrepository;

import com.example.project_leap_25CC024_kishwanth.services.Webservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebservicesImpl implements Webservices {
    @Autowired
    Webrepository webrepository;
    @Override
    public String WriteData(String data) {
        return "";

    }

    @Override
    public String readData() {
        return "";
    }
}
