fun main(args: Array<String>) {
    println("Enter your number:")   
    var number= readLine()!!.toInt()

    if(number%2==0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }
}

