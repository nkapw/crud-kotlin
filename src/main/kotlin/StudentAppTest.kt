import dto.CreateStudentRequest
import entity.Student
import repository.StudentRepositoryImpl
import service.StudentServiceImpl

fun main() {

    val repository = StudentRepositoryImpl()
    val service = StudentServiceImpl(repository)

    service.createNewStudent(CreateStudentRequest("fulan", "2021431", "teknik informatika", 21))

    println(service.listStudent())

    println(service.findStudentByNPM("2021435"))

    service.delete("2021435")
    println(service.listStudent())

}