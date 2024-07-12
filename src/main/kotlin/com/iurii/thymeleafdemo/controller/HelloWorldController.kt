package com.iurii.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/form")
class HelloWorldController {

    @RequestMapping("/show")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/submit")
    fun submitForm(
        @RequestParam("studentName") studentName: String,
        model: Model
    ): String {
        val message = studentName
        model.addAttribute("message", message)
        return "helloworld"
    }

    @RequestMapping("/shout")
    fun shoutForm(
        @RequestParam("studentName") studentName: String,
        model: Model
    ): String {
        val message = studentName.uppercase()
        model.addAttribute("message", "Yo! $message")
        return "helloworld"
    }
}