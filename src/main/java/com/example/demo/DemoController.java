package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wutt
 * 2019/2/22 08:59
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String readersBooks(Model model) {

        return "hello World";
    }
}
