//object GreenHouse {
//    var plants = ArrayList<Plant>()
//    fun takingCare(weekDay: DaysOfWeek) {
//        for (plant in plants) {
//            if (plant.wateringDays.contains(weekDay)) {
//                plant.water()
//                plant.otherTakeCares()
//            }
//        }
//    }
//
//    fun calcTotalProducts(type: ProductType) {
//        for (plant in plants) {
//            if (plant is FruitPlant && plant.type == type) {
//                println("${plant.type} is ${plant.productAmount}")
//            }
//        }
//    }
//
//}
//
//abstract class Plant(var name: String, var waterRequired: Int, var wateringDays: ArrayList<DaysOfWeek>) {
//    fun water() {
//        println("watering $waterRequired liter")
//    }
//
//    abstract fun otherTakeCares()
//
//}
//
//class FruitPlant(
//    name: String,
//    waterRequired: Int,
//    wateringDays: ArrayList<DaysOfWeek>,
//    var type: ProductType,
//    var harvestDays: ArrayList<DaysOfWeek>,
//    var productAmount: Int
//) : Plant(name, waterRequired, wateringDays) {
//    override fun otherTakeCares() {
//        println("plant has been ")
//
//    }
//
//    fun harvestProduct() {
//        println("$type $productAmount")
//    }
//}
//
//class GreenPlant(
//    name: String,
//    waterRequired: Int,
//    wateringDays: ArrayList<DaysOfWeek>,
//    var daysOfFertilization: ArrayList<DaysOfWeek>
//) : Plant(name, waterRequired, wateringDays) {
//    override fun otherTakeCares() {
//
//    }
//
//    fun fertilization() {
//        println("fertilizer")
//    }
//}
//
//enum class ProductType {
//    Felfel,
//    Goje,
//    Kheyar
//}
//
//enum class DaysOfWeek {
//    Saturday,
//    Sunday,
//    Monday,
//    Tuesday,
//    Wednesday,
//    Thursday,
//    Friday
//}
//
//fun main() {
//    var p1 = FruitPlant(
//        "fefelRed",
//        5,
//        arrayListOf(DaysOfWeek.Sunday, DaysOfWeek.Tuesday),
//        ProductType.Felfel,
//        arrayListOf(DaysOfWeek.Sunday),
//        3
//    )
//    var p2 = FruitPlant(
//        "kheyr1",
//        5,
//        arrayListOf(DaysOfWeek.Sunday, DaysOfWeek.Tuesday),
//        ProductType.Kheyar,
//        arrayListOf(DaysOfWeek.Sunday),
//        5
//    )
//    GreenHouse.plants.add(p1)
//    GreenHouse.plants.add(p2)
//    GreenHouse.takingCare(DaysOfWeek.Sunday)
//    GreenHouse.calcTotalProducts(ProductType.Kheyar)
//
//
//}