//abstract class Employee(var name :String,var age :Int,var hourRate:Double){
//    abstract fun salary(hours:Double):Double
//    override fun toString(): String {
//        return "name: $name age: $age hourRate: $hourRate"
//    }
//
//
//
//}
//class Manager(name :String,age :Int,hourRate:Double):Employee(name,age,hourRate){
//    override fun salary(hours: Double): Double {
//        return hourRate*hours
//    }
//
//}
//class Clerk(name :String,age :Int,hourRate:Double):Employee(name,age,hourRate){
//
//    override fun salary(hours: Double): Double {
//        return hourRate*hours/2
//    }
//
//    override fun toString(): String {
//        return "$name is clerk"
//    }
//}
//data class Customer(var name :String,var age :Int,var gender :Gender){
//    override fun equals(other: Any?): Boolean {
//        return (this.name == (other as Customer).name) &&(this.age == other.age)
//    }
//
//
//}
//
//enum class Gender{
//    Male,
//    Female
//}
//fun main(){
//    val c1 = Customer("mamd",25,Gender.Male)
//    val c2 = Customer("mamd",25,Gender.Male)
//
//    var m1 = Manager("taha",52,104.2)
//    var m2 = Manager("reza",42,120.0)
//    var m3 = Manager("farhad",34,120.0)
//    var managers = listOf<Manager>(m1,m2,m3)
//
//    var hours = arrayListOf<Double>(m1.hourRate,m2.hourRate,m3.hourRate)
//    println(hours)
//    println("oldest manager is:")
//    var manger2 = managers.maxByOrNull({ managers -> managers.age })
//    println(manger2)
//
//    if (c1.equals(c2)){
//        println("these customer is same")
//    }else{
//        println("they are not equal")
//    }
//
//
//}