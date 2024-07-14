package com.bebz.students.service

import com.bebz.students.feignclients.Grade
import com.bebz.students.feignclients.GradesFeignClient
import com.bebz.students.model.Student
import com.bebz.students.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository,
    private val gradesFeignClient: GradesFeignClient // Añadido para que funcione el feignclient de grades
) {

    fun findAll(): List<Student> = studentRepository.findAll()

    fun findById(id: Long): Student? = studentRepository.findById(id).orElse(null)

    fun save(student: Student): Student = studentRepository.save(student)

    fun deleteById(id: Long) = studentRepository.deleteById(id)

    // Métodos para obtener información de grades
    fun getAllGrades(): List<Grade> = gradesFeignClient.getAllGrades()

    fun createGrade(grade: Grade): Grade = gradesFeignClient.createGrade(grade)
}