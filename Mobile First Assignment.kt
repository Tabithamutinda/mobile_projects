fun main(){
  name()
    add()
    var result=modulus(4,5)
    println(result)
    personality()

}
fun name(){
    println("Tabitha Mutinda")

}
fun add(){
    var num1=4
    var num2=5
    var num3=7
    var num4=8
    var sum=num1+num2+num3+num4
    println(sum)
}
fun modulus(num1:Int,num2:Int):Int {
    var modulus=(num1%num2)
    println(modulus)
    return(modulus)
}
fun personality(){
    println("Listening to Music")
}