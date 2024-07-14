package com.bebz.students.feignclients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "grades-ms")
interface GradesClient {
    @GetMapping("/grades/student/{studentId}")
    fun getGradesByStudentId(@PathVariable("studentId") studentId: Long): List<Grade>
}
