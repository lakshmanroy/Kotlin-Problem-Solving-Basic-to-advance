fun main(args: Array<String>) {

    println("____________immutableMap___________")
    var age=mapOf<String,Int>("Virat" to 35,"Ronaldo" to 37)
    println("virat age of:" + age["Virat"])
    println("Ronaldo age of:" +age["Ronaldo"])

    println("___________mutabelMap____________")
    var myAge=mutableMapOf<String,Int>("Virat" to 35, "Ronaldo" to 37)

    myAge.put("Lakshman" ,20)
    
    println("virat age of:" + myAge["Virat"])
    println("Ronaldo age of:" +myAge["Ronaldo"])
    println("Lakshman age of:" +myAge["Lakshman"])
}