package ru.schung.webscadabulgar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/her")
    String histPist() {
        return "home";
    }
}
