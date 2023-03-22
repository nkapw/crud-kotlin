package service

import dto.CreateStudentRequest
import dto.StudentResponse
import entity.Student
import repository.StudentRepository

class StudentServiceImpl(val studentRepository: StudentRepository) : StudentService {

    override fun createNewStudent(studentRequest: CreateStudentRequest) {

        val student: Student = Student(
            name = studentRequest.name,
            npm = studentRequest.npm,
            major = studentRequest.major,
            age = studentRequest.age
        )

        studentRepository.save(student)


    }

    override fun findStudentByNPM(npm: String): StudentResponse {
        val student = studentRepository.findByNPM(npm)



        return StudentResponse(
            npm = student.npm,
            name = student.name,
            major = student.major,
            age = student.age

        )

    }

    override fun listStudent(): List<StudentResponse> {
        val students = studentRepository.findAll().map { student: Student ->
            StudentResponse(
                npm = student.npm,
                name = student.name,
                major = student.major,
                age = student.age
            )
        }

        return students
    }

    override fun delete(npm: String) {
        studentRepository.deleteByNPM(npm)
    }
}