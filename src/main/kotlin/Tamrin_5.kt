import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var arr = arrayListOf("a","b","c","d","e","f","g")
    var numSlice = 3
    arr.slice(4)

}
fun <T> ArrayList<T>.slice(numSlice:Int){
    var x = numSlice + 1
    var y = numSlice + 1
    var size = this.size
    var c = size-x

    var sliceArr = arrayListOf<T>()

    while (x < size){
        sliceArr.add(this[x])
        x++
    }

    for (z in 1..c){
        println(this)
        this.removeAt(y)
    }

    print("$this  $sliceArr")


}
