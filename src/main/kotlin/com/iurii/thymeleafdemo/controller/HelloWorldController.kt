package com.iurii.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/form")
class HelloWorldController {

    @RequestMapping("/show")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/submit")
    fun submitForm(): String {
        return "helloworld"
    }
}