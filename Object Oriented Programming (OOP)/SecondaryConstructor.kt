class MySecondaryCar {
    var name:String?=null
    var model:Int?=null
      
    constructor(name:String,model:Int){
        this.name=name
        this.model=model
    }

}

fun main(args: Array<String>) {
    var mySecondCar=MySecondaryCar("Mercedes",2000)
    println("your car's name is ${mySecondCar.name} and mode is ${mySecondCar.model}")
}