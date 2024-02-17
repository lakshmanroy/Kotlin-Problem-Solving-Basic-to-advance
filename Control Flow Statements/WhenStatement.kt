fun main(args: Array<String>) {
    println("Enter your number:")
    var dayNumber=readLine()!!.toInt()
    var day:String
    when(dayNumber)
    {
        1->day= "Monday"
        2->day= "Tuesday"
        3->day= "wednesday"
        4->day= "Thursday"
        5->day= "Friday"
        6->day= "saturday"
        7->day= "Sunday"
        else ->day="Invalid day choice"
    }
    println("day is: $day")
}