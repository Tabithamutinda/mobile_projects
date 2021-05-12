fun main(){
var person= Human("Tabitha",19,50.5)
    person.eat(5,50.5)
    person.speak("I do")
   //person.birthday(19)
    println(account.email)
    println(account.phoneNumber)

}

class Human(name:String,age:Int,weight:Double){
    fun eat(foodWeight:Int,weight: Double) {
        println("I am eating $foodWeight kgs of food")

        var totalWeight = foodWeight + weight
        println(totalWeight)


    }
    fun speak(speech:String){
        println(speech)
    }
    //fun birthday(age: Int):Int{
       // age+=1

    }


data class User(var firstName:String,var lastName:String,var phoneNumber:Int,var email:String,var password:Int){

}