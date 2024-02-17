fun main(args: Array<String>) {
    var number1:Int= readLine()!!.toInt()
    var number2:Int= readLine()!!.toInt()
    var number3:Int= readLine()!!.toInt()

    var largestNumber:Int
    if(number1>=number2)
    {
        if(number1>=number3)
        {
            largestNumber=number1
        }else{
            largestNumber=number3
        }
    }
    else{
        if(number2>=number3)
        {
            largestNumber=number2
        }
        else{
            largestNumber=number3
        }
    }
    println("the largest number is $largestNumber")
}