import java.util.*

fun main(){
identity("Tabitha","Cate","Mercy","Loyce")
    cities()
    numbers()
    name("Tabitha","Cate","Loyce")
}
fun identity(name:String,name2:String,name3:String,name4:String):Array<String> {
    var x= arrayOf(name,name2,name3,name4)
    println(Arrays.toString(x))
    return x
}

fun cities(): Array<String> {
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    var y=cities.sortedArray()
    println(Arrays.toString(y))
    return y
}

fun numbers() {
    //sum of second and fifth elements
    var numbersArray = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var total = (numbersArray)[1] + (numbersArray)[4]
    println(total)

    //Index of 158
    var index = numbersArray.indexOf(158)
    println(index)

    //Elements in ascending order
    var numbers = numbersArray
    var z = numbers.sortedArray()
    println(Arrays.toString(z))

}

fun name(name1:String, name2:String, name3:String):Array<String>{
        var p= arrayOf(name1,name2,name3)
        println(Arrays.toString(p))
        return p

}

