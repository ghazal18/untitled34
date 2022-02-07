open class Clothes(var name: String, var clothesSeason: Season, var basePrice: Int) {
    private var discountStrategy: DiscountStrategy? = null
    fun setDiscountStrategy(discountStrategy: DiscountStrategy) {
        this.discountStrategy = discountStrategy
    }

    fun getPrice(): Long {
        if (discountStrategy == null) {
            return basePrice.toLong()
        }
        return discountStrategy!!.priceByDiscount(this).toLong()
    }

}

abstract class DiscountStrategy {
    abstract fun priceByDiscount(clothes: Clothes): Double

}

class Socks(name: String, clothesSeason: Season, basePrice: Int) : Clothes(name, clothesSeason, basePrice) {}

class Shirt(name: String, clothesSeason: Season, basePrice: Int) : Clothes(name, clothesSeason, basePrice) {}

class Pants(name: String, clothesSeason: Season, basePrice: Int) : Clothes(name, clothesSeason, basePrice) {}

class Jacket(name: String, clothesSeason: Season, basePrice: Int) : Clothes(name, clothesSeason, basePrice) {}

class SummerDiscountStrategy : DiscountStrategy() {
    override fun priceByDiscount(clothes: Clothes): Double {
        return when (clothes.clothesSeason) {
            Season.Spring -> clothes.basePrice * (60.00 / 100.00)
            Season.Summer -> clothes.basePrice * (50.00 / 100.00)
            Season.Summer -> clothes.basePrice * (70.00 / 100.00)
            else -> clothes.basePrice.toDouble()
        }
    }

}

class WinterDiscountStrategy : DiscountStrategy() {
    override fun priceByDiscount(clothes: Clothes): Double {
        if (clothes.clothesSeason == Season.Fall) {
            if (clothes is Jacket){

                return clothes.basePrice*(90.00/100.00)*(60.00/100.00)
            }
            return clothes.basePrice*(60.00/100.00)

        }
        return when (clothes.clothesSeason) {
            Season.Summer -> clothes.basePrice * (50.00 / 100.00)
            Season.Winter -> clothes.basePrice * (70.00 / 100.00)
            else -> clothes.basePrice.toDouble()
        }

    }

}

class YaldaDiscountStrategy : DiscountStrategy() {
    override fun priceByDiscount(clothes: Clothes): Double {
        return when (clothes) {
            is Jacket -> clothes.basePrice * (90.00 / 100.00)
            is Socks -> clothes.basePrice * (80.00 / 100.00)
            else -> clothes.basePrice * (75.00 / 100.00)

        }
    }

}

enum class Season {
    Spring,
    Summer,
    Fall,
    Winter

}

fun main() {
    var p1 = Pants("p1", Season.Spring, 10000)
    var j1 = Jacket("j1", Season.Fall, 10000)
    var sDis = SummerDiscountStrategy()
    p1.setDiscountStrategy(sDis)
    var sdis2 = WinterDiscountStrategy()
    j1.setDiscountStrategy(sdis2)
    println(j1.getPrice())
    println(p1.getPrice())
    val leninCoat = Jacket("Lenin Coat", Season.Fall, 100000)
    println("Lenin Coat : " + leninCoat.getPrice())
    leninCoat.setDiscountStrategy(YaldaDiscountStrategy())
    println("Lenin Coat with Yalda discount: " + leninCoat.getPrice())
    leninCoat.setDiscountStrategy(WinterDiscountStrategy())
    println("Lenin Coat with Winter discount: " + leninCoat.getPrice())
    val woolenSocks: Clothes = Pants("Woolen Socks", Season.Winter, 10000)
    println("Woolen Socks: " + woolenSocks.getPrice())
    woolenSocks.setDiscountStrategy(SummerDiscountStrategy())
    println("Woolen Socks with Summer discount: " + woolenSocks.getPrice())
    woolenSocks.setDiscountStrategy(WinterDiscountStrategy())
    println("Woolen Socks with Winter discount: " + woolenSocks.getPrice())

}