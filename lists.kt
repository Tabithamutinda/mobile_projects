fun main(){
println(isEven(25))
    println(isEven(24))
    println(HomeShopping("omo",5.5,450.50,"Detergent"))
    println(HomeShopping("Carrots",2.5,150.50,"Veggie"))
    println(indices("smart"))
    println(name(arrayOf("Henry","Noah")))
}
fun isEven(x:Int):Boolean{
    if(x%2==0){
        return true
    }
    else{
        return false
    }
}
data class HomeShopping(var name:String,var weight:Double,var price:Double,var category:String){
    fun category(product:HomeShopping){
        var groceryList= mutableListOf<HomeShopping>()
        var hygieneList= mutableListOf<HomeShopping>()
        var otherList= mutableListOf<HomeShopping>()
        when(product.category){
            "groceries"->groceryList.add(product)
            "hygiene"->hygieneList.add(product)
           else->otherList.add(product)
        }
        println(groceryList)
        println(hygieneList)
        println(otherList)
    }
}
fun indices(trait:String):String{
        var character=" "
        trait.forEachIndexed{index,indices ->
            if(index %2==0 ){
                character+=indices
            }
        }
        return character
}
fun name(names:Array<String>):List<String>{
    var title= mutableListOf<String>()
    var count=0
    for(items in names){
        if (items.length%2==0){
            title.add(items)
        }}
    return title
}


