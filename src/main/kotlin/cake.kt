abstract class Cake(protected var name : String,protected var rate :Int) {
    abstract fun calcPrice():Double
    override fun toString(): String {
        return "$name \t $rate"
    }

}
class OrderCake(name:String,rate: Int,var weight:Int):Cake(name,rate){
    override fun calcPrice(): Double {
        return weight*rate.toDouble()
    }

}
class readyMadeCake(name:String,rate: Int,var quantity:Int):Cake(name,rate){
    override fun calcPrice(): Double {
        return rate * quantity.toDouble()
    }

}