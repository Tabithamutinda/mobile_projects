import java.util.*

fun main(){
    var me=identity("Tabitha",19,"AkiraChix","Gigiri,Nairobi","Enjoy doing Kotlin")
    println(me)
    comparison()
    case()
    emptyBlank()
    trim()
    with()
    replace()
    toString()
    arrays()
    arrayLooping()
    arraySorting()
    var important=SchoolPayment("Clara","Ak25",50000.5,40000.5)//asssign a var first
    println(important.studies("Kotlin"))//access using dot for the functions under the class.
    println(important.math(50000.5,40000.5))
    println(important.paidFees)
    var identity=SchoolPayment.Information("Tabitha","Mutinda",8754,"tabbithamutinda@gmail.com")
    println(identity)//assign var
    println(identity.Password)
    println(identity.lastName)

}
fun identity(name:String,age:Int,school:String,location:String,fact:String){ /*passing parameters and intrapolation*/
    var interesting=("My name is $name, $age years old. I study at $school which is at $location and I $fact.")
    println(interesting)

    println("Never "+" give "+" up ") // string concatenation.
}
fun comparison(){ //string comparison.
    var pen="bic"
    var pen1="Bic"
    if (pen==pen1){
        println(true)
    }
    else{
        println(false)
    }
}
fun case(){ //different cases in strings.
    val p="thinkpad"
    println(p.toUpperCase())
    println(p.toLowerCase())
    println(p.capitalize())
    println(p.decapitalize())
}
fun emptyBlank(){ //empty and blank strings
    var t=""
    var m=" "
    println(t.isBlank())
    println(m.isBlank())
    println(t.isEmpty())
    println(m.isEmpty())
}
fun trim(){
    val j=" International "
    println(j.trimStart())
    println(j.trimEnd())
    println(j.trim())
}
fun with(){ //startsWith and endsWith
    val t="codeHive"
    println(t.startsWith("c"))
    println(t.endsWith("e"))
}
fun replace(){ //string replacement
    val text="Nairobi is a humid place"
    println(text.replace("humid","cool"))
}

fun toString(){ //.toString
    val height:Double=5.4
    println("My weight is " + height.toString())
}
fun arrays(){
    var mixedArray=arrayOf("Machakos",57,50.7,"Kangemi")
    println(Arrays.toString(mixedArray))

    var y=(mixedArray.get(1))
    println(y)

    var mixedArray2=(mixedArray.plus("MountainView"))
    println(Arrays.toString(mixedArray2))

    var index=mixedArray2.indexOf("Kangemi")
    println(index)

    //inbuilt array functions
    var digitsArray=arrayOf(4,5,7,8,10)
    var digitsElements=digitsArray.count()
    println(digitsElements)

    var sumArray=digitsArray.sum()
    println(sumArray)

    var minArray=digitsArray.min()
    println(minArray)

    var maxArray=digitsArray.max()
    println(maxArray)

}
fun arrayLooping(){
    var namesArray=arrayOf("Loyce","Cate","Mercy","Michelle")
    namesArray.forEach{x->
        println(x)
    }

    for(x in namesArray){
        println(x)
    }
}
fun arraySorting(){
    var cityArray=arrayOf("Nairobi","Mombasa","Kisumu","Machakos")
    var sortedCity=cityArray.sortedArray()
    println(Arrays.toString(sortedCity))
}
class SchoolPayment(var student:String, var schoolId:String,var schoolFees:Double,var paidFees:Double) {//place variables inside the parameters.
    fun studies(subject: String) {
        println("I am learning $subject")
    }
    fun math(schoolFees: Double, paidFees: Double) {
        var balance = schoolFees - paidFees
        println(balance)
    }
//data class doesn't have a body.
    data class Information(var firstName: String, var lastName: String, val Password: Int, val email: String) {
    }
}
