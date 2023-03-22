package dto

data class CreateStudentRequest(
    val name: String?,
    val npm: String?,
    val major: String?,
    val age: Int?
)