import java.util.*

fun main(){ //an array with names.
var jinaArray=arrayOf("Tabitha","Loyce","Cate","Sandra","Beldine","Jeannine","Marie")
  println(jinaArray[3])
println(jinaArray[0])
var favNumbers= arrayOf(7,5,4,8)


//changing an element in an array.
    var wasaArray=arrayOf("Tabitha","Loyce","Cate","Sandra","Beldine","Jeannine","Marie")
    println(Arrays.toString(wasaArray))
println(wasaArray.toString())
    var wasaArray2=wasaArray.set(4,"Brenda")

//adding an element in an existing array.
   var namesArray=arrayOf("Tabitha","Loyce","Cate","Sandra","Beldine","Jeannine","Marie")
    var namesArray2=namesArray.plus("Brenda")
    var random= arrayOf("Adam",21,3.7,"Alisia")

    println(namesArray.indexOf("Tabitha")) //finding the index of an element.

    //getting an element from an element.
    var name=namesArray.get(2)
    println(name)

    //finding length of an array. .size is an attribute don't put  invoke operator.(.size)

    var size=favNumbers.size
    println(size)  //or use (.count)

    //minimum/null

    var min=favNumbers.minOrNull()
    print(min)

    //maximum/null


        //write a function that brings an average without having to do all those stuff.

    fun average():Int {
        var total= favNumbers.sum()
        var size=favNumbers.size
       return total/size

    }

    //looping.  Runs in a block{}
for (x in namesArray){
    println(x)

    //reverse in loop
    println(namesArray.reverse())

    //add something
    println("namesArray"+24)

    //multiplying in a loop. You can also add, minus and divide.

    for(num in favNumbers){
        var x=num*5
        println(x)

    }
    //you can do anything eg square of anything.
    favNumbers.forEach {num->
        var square=num*num
        println(square)
    }
    //we filter so as to print one thing.
   // random.filter { x-> x is Int}.forEach(
    //println(y)

}
    //foreach
    random.forEach { x->
        println(x)
    }

    //sorting arrays

}
var namesArray=arrayOf("Tabitha","Loyce","Cate","Sandra","Beldine","Jeannine","Marie")
 x=namesArray 

