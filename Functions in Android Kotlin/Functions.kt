fun main(args: Array<String>) {
    print("Enter your first number:")
    var number1=readLine()!!.toInt()
    print("Enter your second number:")
    var number2=readLine()!!.toInt()

    show(number1, number2)

    var a=add(number1, number2)
    println("sum of two number: $a")

    var b=minimumNumber(number1, number2)
    println("minimum number of :$b")
    
}
fun show(num1:Int,num2:Int)
{ 
    println("your number entered $num1 and $num2")
}
fun add(num1:Int,num2:Int):Int
{
    var sum:Int=0
    sum=num1+num2
    return sum
}
fun minimumNumber(num1:Int,num2:Int):Int
{
    var minimum:Int
   if(num1>num2)
   {
    minimum=num2
   }else{
    minimum=num1
   }
   return minimum
}