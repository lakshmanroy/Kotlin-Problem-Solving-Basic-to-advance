fun main(args: Array<String>) {
 
   var age=ArrayList<Int>()
   age.add(5)
   age.add(10)
   age.add(1,20)

   println("First element of arrayList:" +age[0])
   println("Second element of arrayList:" +age[1])
   println("Third element of arrayList:" +age[2])

   println("__________________________________")

   age.remove(10)
   println(age.size)

   println("First element of arrayList:" +age[0])
   println("Second element of arrayList:" +age[1])

   println("_____________________________________-")

   var cars=arrayListOf<String>("cricket","Ford")
   cars.add(2,"play")

   println("First element of array:"+ cars[0])
   println("First element of array:"+ cars[1])
   println("First element of array:"+ cars[2])

   println("_______________________________")

   var myMixArrayList=ArrayList<Any>()

   myMixArrayList.add("Lakshman")
   myMixArrayList.add(4)
   myMixArrayList.add(3.23F)
   myMixArrayList.add(false)
   myMixArrayList.add('R')

   println(myMixArrayList[0])
   println(myMixArrayList[1])
   println(myMixArrayList[2])
   println(myMixArrayList[3])
   println(myMixArrayList[4])
}