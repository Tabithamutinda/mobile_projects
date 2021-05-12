fun main(){
school()
    facts("Tabitha",19)
    println(length("AkiraChix"))
    different("Tabitha")
    different("Tabby")
}
// Characters singling.
fun school(){
    var name="AkiraChix"
    println(name[0])
    println(name[2])
    println(name[3])
}

//Return types and values.
fun facts(name1:String, num1:Int){
    println("Hello my name is $name1 and I am $num1 years old.")
}

//length

fun length(name1:String):Int{
    var statement=(name1.length)
    return (statement)
}

//if.....else

fun different(name:String){
    if (name=="Tabitha"){
       println("That's me!")
    }
    else{
        println("I don't know who that is")
    }
}