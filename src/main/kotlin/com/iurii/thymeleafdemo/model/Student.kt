package com.iurii.thymeleafdemo.model

data class Student(
    var firstName: String = "",
    var lastName: String = "",
    var country: Country? = null,
    var programmingLanguage: ProgrammingLanguage? = null
)
