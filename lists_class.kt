fun main() {
    var classes = listOf("AnitaB", "LoveLace", "LisaLab") //Immutable lists
    println(classes)
    var ages = mutableListOf(18, 23, 45, 27, 45)
    println(ages)
    ages.add(15)
    ages.addAll(listOf(20, 75, 85))
    println(ages)
    ages.remove(18)//removing elements
    println(ages)
    ages.removeAt(2)//removing at an index
    println(ages)

    var names =
        mutableListOf<String>()//creating empty list you have to specify the type of elements stored there like Strings
    names.addAll(listOf("Tabitha", "Musenya", "Mutinda"))
    println(names)
    //if you dont specify then place your values in the parameter

    //list of any type.

    var data = mutableListOf<Any>("Tabby", 1.5, 19, 10.4.toFloat(), true)
    println(data)

    //or create an empty list first then add
    var datae = mutableListOf<Any>()
    datae.addAll(listOf("Tabby", 1.5, 4, true))
    println(datae)

    val words = listOf("Pen", "cat", "dog", "kitten", "puppy")//finding size of a list.
    println("The list contains ${words.size} elements")

    var bigList = listOf("Kenya", 42, 32, "USA", true, 57)//checking for integers
    var intTotal = 0
    for (item in bigList) {
        if (item is Int) {
            intTotal += item
        }
    }
    println(intTotal)
    println(bigList.count())//also to find size of a list

    val nums = listOf(11, 5, 3, 8, 1, 9, 6, 2)//messages
    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()
    val msg = """
               max: $max, min: $min,
               count: $len, sum: $sum,
               average: $avg
              """
    println(msg.trimIndent())


    data class Car(var make: String, var model: String)

    var car = Car("Toyota", "Prado")//car variables
    var car2 = Car("Subaru", "Outback")
    var car3 = Car("VW", "Golf")

    var carsList = listOf(car, car2, car3)
    println(carsList)
    println(carsList[0])
    for (car in carsList) {
        println(car.model)
        println(car.make)
    }
    //create mutable list of custom elements.
    data class Person(var name:String,var age:Int,var weight:Double)
    var friends= mutableListOf<Person>()
    friends.addAll(listOf(Person("Jane",19,50.0),
        Person("Tabby",18,52.0)))
    println(friends)
    friends.addAll(listOf(Person("Haman",25,70.0)))
    println(friends)
    friends.removeAt(1)//roving at index
    println(friends)
}

