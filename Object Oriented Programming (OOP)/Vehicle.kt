class Vehicle{
    var type:String?=null
    var model:String?=null
    var maxSpeed:Int?=null
    fun show(){

        println("type is:$type")
        println("type is:$model")
        println("type is:$maxSpeed")
    }
    }

fun main(args: Array<String>) {
    var vehicle=Vehicle()
    vehicle.type="car"
    vehicle.model="Ferrari"
    vehicle.maxSpeed=360

    vehicle.show()
    
}