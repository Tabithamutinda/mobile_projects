fun main(){
var occupation=Banker("Me",25)
    occupation.countMoney(listOf(100,200,400))
    var farmer=Farmer("Kim",40)
    var doctor=Doctor("Josh",50)
    doctor.treatPatient("Tabby","Malaria")
    farmer.cultivateLand()
}
open class Person(var name:String, var age:Int){
    fun talk(words:String){
        println(words)
    }
    fun sleep(){
        println("ZZZZZ")
    }
    fun eat(){
        println("Yummy")
    }
}
class Banker(name:String, age:Int):Person(name,age)//don't redeclare the vars in the parameters
 {
    fun countMoney(notes:List<Int>){
        var sum=0// used to loop through the money given
        notes.forEach{note->
            sum+=note
        }
        println(sum)
    }
}
class Farmer(name:String, age:Int):Person(name,age) {
    fun cultivateLand() {
        println("dig dig dig")
    }
}
class Doctor(name:String, age:Int):Person(name,age) {
    fun treatPatient(patient: String, disease: String) {
        println("Treat $patient for $disease")
    }
}