fun main(args: Array<String>) {
    var age=arrayOf(1,2,3)
    println("First element of array" + age[0])
    println("Second element of array" + age[1])
    println("Third element of array" + age[2])

    println("________________________________________")

    var cars= arrayOf("Mercedes","BMW","Opel")

    println("First element of array" + cars[0])
    println("Second element of array" + cars[1])
    println("Third element of array" + cars[2])

    println("_________________________________________")

    cars.set(2, "Ford")
    println("First element of array" + cars[0])
    println("Second element of array" + cars.get(1))
    println("Third element of array" + cars[2])

    println("______________________________________")

    var carAndage=arrayOf("Mercedes",5,"BMW",7,)
    println("First element of array" + carAndage[0])
    println("Second element of array" + carAndage.get(1))
    println("Third element of array" + carAndage[2])
    println("Four element of array" + carAndage[3])
}