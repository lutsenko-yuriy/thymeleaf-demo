package com.iurii.thymeleafdemo.controller

import com.iurii.thymeleafdemo.model.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/student/registration")
class StudentController {

    @RequestMapping(value = ["/", "/form"])
    fun showForm(model: Model): String {
        val student = Student()
        model.addAttribute("student", student)
        return "student/form"
    }

    @RequestMapping("/register")
    fun registerStudent(@ModelAttribute("student") student: Student, ): String {
        println(student)
        return "student/register"
    }
}