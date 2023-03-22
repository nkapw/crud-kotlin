package repository

import entity.Student


private val model: MutableList<Student> = arrayListOf(Student("imam","2021435","informatika", 21), Student("ihab", "2021436", "industri", 20))

class StudentRepositoryImpl : StudentRepository {

    override fun save(student: Student) {
        model.add(student)

    }


    override fun findAll(): List<Student> {
        return model
    }

    override fun findByNPM(npm: String): Student {
        var student: Student = Student("","","",0)
        for (i in 0 until model.size - 1) {
            if (model[i].npm == npm) {
                student = model[i];
            }
        }
        return student
    }

    override fun deleteByNPM(npm: String) {
        for (i in 0 until model.size - 1) {
            if (model[i].npm == npm) {
                model.removeAt(i)
            }
        }
    }


}