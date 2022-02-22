class Foo<T>(var x :T,var y : T){
    fun compare(x : T,y:T):T{
       if (x is Int && y is Int){
           if (x > y){
               return x
           }
           return y

       }
        return x

    }

}




