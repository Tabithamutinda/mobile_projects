fun main(){
var mtu=Person("Tabitha",19)
   mtu.talk("Heeeeeey")
    mtu.eat()
    mtu.sleep()
    var occupation=Doctor("MattPeter",19)
    occupation.treatPatient("Loyce","Malaria")
    occupation.eat()


}
open class Person(var name:String, var age:Int){
    fun talk(words:String){
        println(words)
    }
    open fun eat(){
       println("Yummy")
    }
    fun sleep(){
        println("ZZZZZ")
    }
}
class Doctor(name:String,age: Int):Person(name, age){//we don't use var in the parameters sin its like redeclaring it again hence repetition.
    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease.")
    }
    override fun eat() {
       super.eat()
        println("I eat whatever I get")
    }
    }
