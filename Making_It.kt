fun main() {
    school()
    details("Tabitha",18)
    println(school("AkiraChix"))
    cool("Tabitha")
    cool("Tabby")
}
//string characters. Concatination or intrerpronation.
fun school(){
    var campus="AkiraChix"
    var x=campus[0]
    var y= campus[2]
    var z=campus[3]
    println(x.toString()+y.toString()+z.toString())
}

//Question 2: Intrapolation.
fun details(name1:String,num1:Int):String{
    return "Hello my name is $name1 and I am $num1 years old"
}

//Strings length.
fun school(name:String):Int{
    var x=name.length
    return(x)
}

//Question 4.
fun cool(name:String){
    if( name=="Tabitha" ) {
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }

}