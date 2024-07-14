package com.bebz.students.controller

import com.bebz.students.feignclients.Grade
import com.bebz.students.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students/grades")
class StudentGradeController(private val studentService: StudentService) {

    @GetMapping
    fun getAllGrades(): ResponseEntity<List<Grade>> = ResponseEntity.ok(studentService.getAllGrades())

    @PostMapping
    fun createGrade(@RequestBody grade: Grade): ResponseEntity<Grade> = ResponseEntity.ok(studentService.createGrade(grade))
}