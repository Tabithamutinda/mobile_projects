fun main(){
number(45)
    number(44)
    number(41)
    evaluate(2)
    evaluate(5)
   println(credential("wewryuyd"))
    println(credential("56554432321ffgf6"))
    println(credential("password"))


}
//if
fun number(age:Int) {
    if (age == 45) {
        println("That's my number!")
    } else {
        println("congrats")
    }
    //else{
//        if(age<45){
//            println("A few more")
//        }
//    }
//}
}
//if else
fun me(name:String){
    val name="Tabby"
    if(name=="Mutinda"){
        println("Myself")
    }
    else{
        println("Not me!")
    }
}
    fun evaluate(x:Int){
        if (x%2==0){
            println("Even number")
        }
        else{
            println("Odd number")
        }

    }
fun credential(password:String):Boolean {
    if (password.length >= 8) {
        return true
    }
    if (password.length >= 16) {
        return true
    } else if (password == "password") {
        return false
    }
return credential("e5465try3765")
}

