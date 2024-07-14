package com.iurii.thymeleafdemo.controller

import com.iurii.thymeleafdemo.model.Country
import com.iurii.thymeleafdemo.model.OperatingSystem
import com.iurii.thymeleafdemo.model.ProgrammingLanguage
import com.iurii.thymeleafdemo.model.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/student/registration")
class StudentController {

    val availableCountries = Country.entries.filter { it.countryName.length >= 4 }

    val languages = ProgrammingLanguage.entries.filter { it.langName.length >= 4 }

    val operatingSystems = OperatingSystem.entries

    @RequestMapping(value = ["/", "/form"])
    fun showForm(model: Model): String {
        val student = Student()
        model.addAttribute("student", student)
        model.addAttribute("availableCountries", availableCountries)
        model.addAttribute("languages", languages)
        model.addAttribute("operatingSystems", operatingSystems)
        return "student/form"
    }

    @RequestMapping("/register")
    fun registerStudent(@ModelAttribute("student") student: Student): String {
        println(student)
        return "student/register"
    }
}