//import java.util.*
//import kotlin.collections.ArrayList
//
//fun main(){
//    var read = Scanner(System.`in`)
//    var numberOfArrayIndexess = read.nextInt()
//    var array = ArrayList<Int>()
//    for (x in 1..numberOfArrayIndexess){
//        var arrayItems = read.nextInt()
//        array.add(arrayItems)
//    }
//    if (numberOfArrayIndexess % 2 != 0){
//        array.removeAt(numberOfArrayIndexess-1)
//    }
//    println(array)
//    var lnght = array.size/2
//    var i = 0
//    for (x in 1 until lnght+1){
//        var x1 = array[i]
//        i++
//        var x2 = array[i]
//        i++
//        println(x1)
//        println(x2)
//        if (x2 < x1){
//            array.removeAt(i-2)
//            array.removeAt(i-1)
//            i = i - 2
//
//        }
//        println(array)
//    }
//
//
//
//}
