fun main(){
    //if...else statement.
    val age=19
    if (age>=19){
        println("Hurrah am legal now!")
    }
    else{
        println("Oh no, still trying")
    }
     // if...elseif...else

    val nationality="Kenyan"
    if (nationality=="Rwandese"){
        println("Have you ever been to Kigali?")
    }
    else if (nationality=="Ugandan"){
        println("Have you ever been to Kampala?")
    }
    else if (nationality=="Kenyan"){
        println("Have you ever been to Nairobi?")
    }
    else{
        println("You gotta visit East African countries")
    }

    //when statement

    var nationality2="Kamba"
    when(nationality2){
        "Ugandan"-> println("Have you ever been to Kampala?")
        "Rwandese"-> println("Have you ever been to Kigali?")
        "Kenyan"-> println("Have you ever been to Nairobi?")
        else -> println("You gotta visit those cities dude!")
    }
containers(14)

    //for loop
    var languages= arrayOf("Kotlin","Python","JavaScript","Go")
    for(language in languages){
        println(language)
    }
    for (n in 1..10){
        println(n)
    }
    var name="Tabitha"
    for (t in name){
        println(t)
    }

}

fun containers(litres:Int){
    when(litres){
        1,2,3,4,5-> println("Pour the water in a sufuria.")
        6,7-> println("Pour the water in a bucket.")
        8,9-> println("Pour the water in a jerrycan.")
        10,11,12,13,14-> println("Pour the water in a water drum.")
    }
}
