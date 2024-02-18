class myCars constructor(var name:String,var model:Int){
    init{
        println("your car's name is $name and model is $model")
    }
   
}

fun main(args: Array<String>) {
    var myNewCars= myCars("Ferrari",2024)
    // println("your car's name is ${myNewCars.name} and model is ${myNewCars.model}")
}