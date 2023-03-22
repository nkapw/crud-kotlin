package repository

import entity.Student

interface StudentRepository {

    fun save(student: Student)
    fun findAll(): List<Student>
    fun findByNPM(npm: String):Student
    fun deleteByNPM(npm: String)




}