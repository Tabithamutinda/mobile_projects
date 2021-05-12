import java.util.*

class Person(){
    var name:String=""
    var age:Int=0

    override fun toString(): String {
            return "Person(name='$name' , age='$age')"

    }

}
fun main() {
    var pp1 = Person()
    pp1.name = "Tabitha"
    pp1.age = 19
    println(pp1)

    println("In " + "the " + "game ")
    println("In".plus(" the").plus(" game"))

    var x = 6
    x++
    println(x)

    var y = 8
    y--
    println(y)

    var a = 10
    var b = 25
    var c = 20
    var add = a + b + c
    var modulus = b % a
    var multiplication = a * b * c
    var subtract = b - c - a
    println(add)
    println(modulus)
    println(multiplication)
    println(subtract)


    val j = 5
    val k = 7
    println(k == j)
    println(k > j)
    if (k > j) {
        println("k is greater than j")


    }
     var p=true && true
    var t=true && false
    var l=false&&false
    val o=false&&true
    println(p)
    println(t)
    println(l)
    println(o)

    val words= arrayOf("kind","massive","atom","car","blue")
    Arrays.sort(words){s1:String,s2:String ->s1.compareTo(s2)}
    println(Arrays.toString(words))


}