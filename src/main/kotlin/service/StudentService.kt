package service

import dto.CreateStudentRequest
import dto.StudentResponse
import entity.Student

interface StudentService {
     fun createNewStudent(student: CreateStudentRequest)

    fun findStudentByNPM(npm:String ): StudentResponse

    fun listStudent(): List<StudentResponse>

    fun delete(npm: String)

}