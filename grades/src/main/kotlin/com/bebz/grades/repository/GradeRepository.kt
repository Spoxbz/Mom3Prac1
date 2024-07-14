package com.bebz.grades.repository

import com.bebz.grades.model.Grade
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GradeRepository : JpaRepository<Grade, Long>{
    //fun findByStudentId(studentId: Long): List<Grade>
}