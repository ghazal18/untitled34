import java.time.LocalDateTime

data class Person(
    var id: Int,
    var name: String,
    var age: Int,
    var noteList: ArrayList<Note>,
    var height: Double,
    var startWeight: Double = 0.0,
    var currentWeight: Double = 0.0
) {
    var weightLost = startWeight - currentWeight
    fun getTodayTotalCalories() {}
    fun addNote(note: Note) {}
    fun printInformation() {
        println("name is $name and id id $id and $name lost $weightLost kg ")
    }

    init {
        if (startWeight != currentWeight) {
            printInformation()

        }
    }

    var successFunction: (Person) -> Boolean = {
        var BMI = currentWeight / (height * height)
        if (age > 40 && weightLost > 5) {
            true
        } else if (BMI > 18.5 && BMI < 24.9) {
            true
        }
        false
    }

    fun printSuccessfulMembers(person: Person, successFunction: (Person) -> Boolean) {
        if (successFunction(person)){
            println("$name was Successful")

        }

    }


}

object Club {
    lateinit var name: String
    lateinit var memberList: ArrayList<Person>
    fun addMember(person: Person) {
        memberList.add(person)
    }

    fun removeMember(person: Person) {
        memberList.remove(person)
    }

    fun printMember(personList: ArrayList<Person>) {
        println(memberList)
    }

}

open class Note(var id: Int, var dataTime: Int) {}
class FoodNote(id: Int, dataTime: Int, var Calories: Int) : Note(id, dataTime) {}
class ExerciseNote(id: Int, dataTime: Int, var type: ExerciseType, var caloriesUsed: Int) : Note(id, dataTime) {

}

class WeightNote(id: Int, dataTime: Int, var weight: Double) : Note(id, dataTime) {}

//class LocalDateTime{
//    val current = LocalDateTime.now();
//}
enum class ExerciseType {
    Bike,
    Walk,
    Swim
}

fun main() {
    var noteList = ArrayList<Note>()
    var n1 = Note(624,25)
    noteList.add(n1)
    var n2 = Note(624,26)
    noteList.add(n2)
    var p1 = Person(88, "sahel mir", 23, noteList ,45.36, 65.8, 55.5)
    var p2 = Person(88, "fatemeh amini", 62, noteList ,65.2, 70.0, 55.5)

    p2.printSuccessfulMembers(p2,p2.successFunction)


}

