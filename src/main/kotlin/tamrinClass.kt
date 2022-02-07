import java.util.*
import kotlin.collections.RandomAccess
import kotlin.random.Random

open class Food(var name: String , private var calories: Long){


    override fun equals(other: Any?): Boolean {
        return this.calories == (other as Food).calories
    }

    override fun toString(): String {
        return "food name = $name and calories=$calories"
    }


}
class Pizza(name: String, calories: Long):Food(name , calories){

}
class Flafel(name: String ,calories: Long):Food(name , calories){

}
class Hamburger(name: String,calories: Long):Food(name , calories){

}
//class Restaurant(calories: Long):Food(name , calories){
//
//
//}

fun main() {
    val foodList = Array<Food?>(10) { null }
    var y = 0
    for (i in 0 until foodList.size-1) {
       var x = Random.nextInt(1,4)
        when (x) {
            1 -> {
                var f1 = Pizza("pizza",500)
                foodList[i] = f1
                y++
            }
            2 -> {
                var f1 = Flafel("felafel",300)
                foodList.set(i,f1)
                y++
            }
            else -> {
                var f1 = Hamburger("hamburger",600)
                foodList.set(i,f1)
                y++
            }
        }
    }
    Arrays.sort(foodList)

    for (i in 0 until foodList.size-1) {
        println(foodList[i])
    }
}




