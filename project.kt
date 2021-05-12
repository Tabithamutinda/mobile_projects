import java.util.*

fun main(){
    introduction("Tabitha",19)
    dispensor(5)
    dispensor(10)
    dispensor(17)
    name("Tabitha","Mutinda","Sam","Fidel")
    numbers(15,17)
    var person=Human("Daphne",19,50.5)
    person.eat(5)
    person.speak("whats poppin?")
    comparison(54,57)
    println(println(Arrays.toString(list("Aisha","Kuzon","Haduja","Kenzi","Walt"))))
}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old.")
}
fun dispensor(age:Int){
    if(age<6){
        println("Glass of milk")
    }
    else if(age>6 && age<15){
        println("Fanta")
    }
    else{
        println("Coca cola")
    }
}
fun name(a:String,b:String,c:String,d:String):Array<String>{
    var x=arrayOf(a,b,c,d)
    for(l in x)
        if(l.length>5) {
            println(l)
        }
    return x
}
fun numbers(num1:Int,num2:Int){
     var sum=num1+num2
    var modulus=num1%num2
    var divide=num1/num2
    println(sum)
    println(modulus)
    println(divide)
}
class Human(name:String, age:Int, weight:Double) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food.")
    }
    fun speak(speech:String){
        println(speech)
    }
//    fun birthday(age: Int):Int{
//        var total=age+=1
//        println(total)
//        return(total)
//
//    }
}
fun comparison(num3: Int,num4:Int){
    var y=num4.compareTo(num3)
    println(y)
}
//fun game(player1:String,player2:String){
//
//}
fun list(a:String,b:String,c:String,d:String,e:String):Array<String>{
    var x= arrayOf(a,b,c,d,e)

    return x
}