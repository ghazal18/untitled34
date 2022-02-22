import java.sql.Time
import java.util.*
import kotlin.collections.ArrayList

class Student(val name: String, val id: Int) {
    var average: Double? = null
    var lessonList: ArrayList<Lesson> = arrayListOf()
    var gradeMap: MutableMap<Lesson, Double> = mutableMapOf()

    fun printLessons() {
        for (lesson in lessonList) {
            println(lesson.name)
        }
    }

    fun addGrade(lesson: Lesson, garde: Double) {
        if (lesson !in lessonList) {
            println("invalid Grade")
            return
        }
        gradeMap[lesson] = garde
    }

    fun getAverage(): Double {
        var sum = 0.0
        for (grade in gradeMap) {
            sum += grade.value
        }
        return sum / gradeMap.size
    }


}

class Lesson(
    val name: String,
    val id: Int,
    var teacher: Teacher,
    var units: Int,
    var examDate: Date?
) {
    var averageOfStudents: Double? = null
    var studentList: ArrayList<Student> = arrayListOf()

    fun addStudent(student: Student) {
        this.studentList.add(student)
        student.lessonList.add(this)
    }
}

class Teacher(
    val name: String,
    val id: Int
) {

}

val sara = Student("sara rezaie", 1)
val sina = Student("Sina gholami", 2)
val sadr = Teacher("sadr", 567)
var math = Lesson("math", 234, sadr, 3, null)
var phyisics = Lesson("fizik", 235, sadr, 3, null)


fun main() {

    math.addStudent(sara)
    math.addStudent(sina)
    phyisics.addStudent(sara)
    sara.printLessons()


}