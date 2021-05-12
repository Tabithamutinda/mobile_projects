fun main(){
//oddNumbers()
//    println(names(arrayOf("Tabitha","Mercy","Josephine","Matthew","Mutinda")))
//    robot(5)
//    robot(14)
//    robot(20)
//    number()
//    multiples()
    multiple()
}
fun oddNumbers() {
    for (x in 1..100)
        if (x % 2 != 0) {
            println(x)
        }
}
//    alternatively
//    fun oddNumbers(){
//        for(y in 1..100 step 2){
//            println(y)
//        }
//    }
fun names(namesArray:Array<String>):Int{
    var y=0
    for(k in namesArray)
        if(k.length>5){
            y++
        }
    return y
}
fun robot(age:Int) {
    if (age < 6) {
        println("Milk.")
    } else if (age > 6 && age < 15) {//alternatively (age in 6..15)
        println("fanta orange.")
    } else {
        println("Coca cola.")
    }
    //this doesn't account for the 6 year old.
}
//alternatively
//fun robotServe(age:Int){
//    when (age){
//        in 1..5->println("Serve guest a glass of milk")
//        6..14-> println("Serve fanta orange")
//        else->println("Coca cola")
//    }
//}
    fun number(){//find if its possible to use a when statement.
        for(i in 1..100){
            if(i%3==0 && i%5==0){
                println("FizzBuzz")
            }
            else if(i%5==0){
                println("Buzz")
            }
            else if(i%3==0){
                println("Fizz")
            }
            else{
                println(i)
            }
        }
    }
//class assignment
fun multiples(){
    for(i in 1..1000){
        if(i%6==0 && i%8==0){
            println("Bingo!")
        }
        else if(i%6==0 || i%8==0) {
            println(i)
        }
    }
}
//or
