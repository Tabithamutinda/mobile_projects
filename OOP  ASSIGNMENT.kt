fun main(){
    var person=Human("Tabitha",19,50)
    person.eat(12)
    person.weight()
    person.speak("I do")

    var details=User("Tabitha","Mutinda","tabbithamutinda@gmail.com","0740918287",25654)
    println(details.email)
    println(details.firstName)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat (foodWeight:Int){
        println("I am  eating $foodWeight Kgs of food")
        weight+=foodWeight
        println(weight)
    }

    }
    fun speak(speech:String):String{
        println(speech)
    }
    fun birthday():Int {
        age += 1
        println(age)
        return (age)
    }

    data class User(val firstName:String,val lastName:String,val email:String,val phoneNumber:String,val password:Int){

    }
