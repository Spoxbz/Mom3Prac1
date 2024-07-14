package com.bebz.students.service

import com.bebz.students.feignclients.Grade
import com.bebz.students.feignclients.GradesClient
import com.bebz.students.model.Student
import com.bebz.students.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository,
    private val gradesClient: GradesClient // Añadido para que funcione el feignclient de grades
) {

    fun findAll(): List<Student> = studentRepository.findAll()

    fun findById(id: Long): Student? = studentRepository.findById(id).orElse(null)

    fun save(student: Student): Student = studentRepository.save(student)

    fun deleteById(id: Long) = studentRepository.deleteById(id)

    // Método para obtener las notas de un estudiante
    fun getStudentWithGrades(studentId: Long): Pair<Student, List<Grade>>? {
        val student = findById(studentId) ?: return null
        val grades = gradesClient.getGradesByStudentId(studentId)
        return Pair(student, grades)
    }
}