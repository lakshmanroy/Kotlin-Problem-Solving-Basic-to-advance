fun main(args: Array<String>) {
    var mySetArray=arrayListOf<Any>("Android",34.3,6,'R',"Kotlin")
    println(mySetArray.size)
    println(mySetArray.last())

    println("___________________________________")

    var mySet= setOf<Any>("Android",8,'R',3.14f,"Kotlin")

    println(mySet.size)
    println(mySet.first())
}