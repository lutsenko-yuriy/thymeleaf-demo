package com.iurii.thymeleafdemo.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/form")
class HelloWorldController {

    @RequestMapping("/show")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/submit")
    fun submitForm(request: HttpServletRequest, model: Model): String {
        val message = request.getParameter("studentName")
        model.addAttribute("message", message)
        return "helloworld"
    }

    @RequestMapping("/shout")
    fun shoutForm(request: HttpServletRequest, model: Model): String {
        val message = request.getParameter("studentName").uppercase()
        model.addAttribute("message", "Yo! $message")
        return "helloworld"
    }
}