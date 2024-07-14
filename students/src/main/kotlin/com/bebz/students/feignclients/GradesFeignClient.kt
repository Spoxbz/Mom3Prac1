package com.bebz.students.feignclients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "grades-ms")
interface GradesFeignClient {
    @GetMapping("/grades")
    fun getAllGrades(): List<Grade>

    @PostMapping("/grades")
    fun createGrade(@RequestBody grade: Grade): Grade
}
