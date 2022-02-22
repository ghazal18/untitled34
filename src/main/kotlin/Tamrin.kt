//import java.util.*
//
//class Rational(var numerator: Int = 0, var denominator: Int = 1) {
//
//
//    fun findGCD(): Int {
//        var gcd = 1
//        var i = 1
//        while (i <= denominator && i <= numerator) {
//            // Checks if i is factor of both integers
//            if (denominator % i == 0 && numerator % i == 0)
//                gcd = i
//            ++i
//        }
//        return gcd
//    }
//
//    fun simplify() {
//        var newNumerator = numerator / findGCD()
//        var newDenominator = denominator / findGCD()
//        println("your new factor is $newNumerator/$newDenominator")
//    }
//
//    fun add(num: Rational): Rational {
//
//        var num3 = Rational(this.denominator*denominator,this.denominator*numerator+this.numerator*denominator)
//        println(num3)
//        return num3
//    }
//
//    fun sub(num: Rational): Rational{
//        var num4 = Rational(this.denominator*numerator-this.numerator*denominator,this.denominator*denominator)
//        println(num4)
//        return num4
//    }
//
//    fun mul(num: Rational): Rational{
//       var num5 = Rational(this.numerator*numerator,this.denominator*denominator)
//       println(num5)
//       return num
//    }
//
//    fun div(num: Rational): Rational{
//       var num6 = Rational(this.numerator*denominator,this.denominator*numerator)
//        return num6
//
//    }
//
//    fun toFloatingPoint(): Double {
//        var x = numerator.toDouble()
//        var y = denominator.toDouble()
//        println(x / y)
//        return x / y
//    }
//
//    fun toStr(): String {
//        var str1 = numerator.toString()
//        var str2 = denominator.toString()
//        println("$str1/$str2")
//        return "$str1/$str2"
//    }
//
//    fun toMakhlotString(): String {
//        var addadKamel = (numerator / denominator).toString()
//        var baghimande = (numerator % denominator).toString()
//        println("$addadKamel + $baghimande/ $denominator")
//        return "$addadKamel + $baghimande/ $denominator"
//    }
//
//
//}
//
//fun main() {
//    var num1 = Rational(28, 18)
//    var  num2 = Rational(5,8)
//    num1.add(num2)
//
//
//
//}
