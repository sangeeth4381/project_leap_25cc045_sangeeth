package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class WebController {

package com.example.demo.Controller;

import com.example.demo.model.Json;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class WebController {
        @GetMapping("/calculate")
        int calculate(int a, int b, char opreation) {
            switch (opreation) {
                case '+' -> {
                    return a + b;
                }
                case '-' -> {
                    return a - b;
                }
                case '*' -> {
                    return a * b;
                }
                default -> {
                    return a / b;
                }
            }
        }

        @GetMapping("/json")
        public Json getJson() {
            Json json = new Json();
            json.setName("Aravind");
            json.setDept("CCE");
            json.setRollno(12);
            json.setUsername("aravind10");
            return json;
        }

    }
}