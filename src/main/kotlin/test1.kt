class Branch(var city :String,var code:String) {
    var rate = 0
    init {
        if(code =="a12"||code=="a13"||code=="a14"){
            rate = 1
        }
        else if(code =="b12"||code=="b13"||code=="b14"){
            rate = 2
        }
        else{
            rate = 3
        }
    }
}

class Account (branch: Branch){
    private var accountNumber = ""
    private var balance: Double = 0.0
    fun setAccountNumber(){
        var accnumber = (100000..1000000).random()
        accountNumber = accnumber.toString()
    }
    fun getBalance():Double{
        return balance
    }

}

class CreditCard {
    var cardNumber: String = ""
    private var credit: Double = 0.0
    fun setCardNumber(){
        var crdnum = (10000000..1000000000).random()
        cardNumber = crdnum.toString()
    }
    fun getCredit(): Double {
        return credit
    }


}

class Customer(var name: String) {
    val branch = Branch ("tehran","1")
    var acc = Account(branch)
    var card = CreditCard()
    fun calCustomerBalance(): Double {
        var existMoney = card.getCredit() + acc.getBalance()
        println(existMoney)
        return existMoney
    }

}
fun main(){

    var customerArr = arrayListOf<Customer>()
    for(x in 1..20){
        var c1 = Customer("customer1")
        customerArr.add(c1)
    }

}