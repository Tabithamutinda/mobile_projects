fun main(){
var person=Human("Tabitha",19,50.5)
    person.eat(5,50.5)

}

class AHuman(name:String,age:Int,weight:Double){
    fun eat(foodWeight:Int,weight: Double){
       println("I am eating $foodWeight kgs of food")
    }
}