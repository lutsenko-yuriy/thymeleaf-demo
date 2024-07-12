package com.iurii.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@Controller
class DemoController {

    @GetMapping("/")
    fun sayHello(model: Model): String {
        model.addAttribute("date", LocalDateTime.now())

        return "helloworld"
    }
}