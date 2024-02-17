fun main(args: Array<String>) {
  // sum of number
  var sum:Int=0
    for(x in 0..5)
    {
        println(x)
        sum+=x
    }
    println("sum of numbers= $sum")

    println("_________________")
    

    /*for (i in 1..10) {
        println(i)
    }
    */
  
    // sum of number


   /*  var sum:Int=0
    for(x in 0..10)
    {
        if(x%2==0){
            println(x)
            sum+=x
        }
    }
    println("sum of numbers= $sum")
    */

    var myNumberArray= arrayListOf<Any>(1,2,3,4,5,6,7,8)
    for(y in myNumberArray)
    {
        println(y)
    }
}