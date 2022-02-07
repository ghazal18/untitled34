import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var arr = arrayListOf<Int>(5,3)
    print(arr)
    var arr2 = arrayListOf<String>("salam")
    print(arr2)


}
fun <T> print(array : ArrayList<T>){
    println(array)
}