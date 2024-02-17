fun main(args: Array<String>) {
    var number1:Int=12
    var number2:Int=10
    var number3:Int=20

    var result:Boolean=false

    result= (number1>number2 && (number3>number2))
    println("Result=" +result)

    result= (number1>number2 || (number3>number2))
    println("Result=" +result)

}