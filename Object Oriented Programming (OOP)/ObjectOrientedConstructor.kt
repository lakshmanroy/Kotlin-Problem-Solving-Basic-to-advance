class Cars{
    var name:String?=null
    var model:Int?=null
}

fun main(args: Array<String>) {
    var myCars=Cars()
    myCars.name="Mercedes"
    myCars.model=2010

    var myCars2=Cars()
    myCars2.name="Ferrari"
    myCars2.model=2021

    println("your cars name is ${myCars.name} and model is ${myCars.model}")
    println("your cars name is ${myCars2.name} and model is ${myCars2.model}")
}