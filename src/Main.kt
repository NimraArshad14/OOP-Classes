fun main() {


//    val car = Car(brand = "valo", "s1",2020)
//    val car1 = Car(brand = "toyota", model = "corrola", year = 2024)
//    println(car.brand)
//    println(car.model)
//    println(car.year)
//
//    println(car1.brand)
//    println(car1.model)
//    println(car1.year)
    val dog = Dog()
    dog.sound()
    val cat = Cat()
    cat.sound()
    val person = Person("nimra" , 20)
}

//Another class create of car
//class Car(var brand: String, var model: String, var year: Int) {
//    var price: Int
//    var brand: String
//    var model: String
//    var year: Int
//
//    constructor(brand: String, model: String) {
//
//        this.brand = brand
//        this.model = model
//        this.year = 2024
//    }
//
//    constructor(brand: String, model: String, year: Int) {
//
//        this.brand = brand
//        this.model = model
//        this.year = 2024
//    }
//}

    //using super class
    open class Bird {
        // using final method
        // without open method
        fun sound() {
            println("animal make a sound")
        }
    }

        class sparrow() : Bird() {
            val sound = super.sound()
        }


    open class Animal {
        open fun sound() {
            println("animal make a sound")
        }
    }
        class Dog : Animal() {
            override fun sound() {
                println("dog barks")
            }
        }

        class Cat : Animal() {
            override fun sound() {
                println("cat meow")
            }
        }
//another parent ,child classes using with properties
   open class Person (open val name : String, val age : Int) {
       open fun sleep () {
           println("person sleeps")
       }

    }
    class Student( name : String, age : Int) : Person( name = name, age = age) {
        override val name : String = ""

    }

// using abstract class must be used override method
// abstract class not have object

open class Parent (open val name : String, val age : Int) {
    open fun sleep () {
        println("parent have childs")
    }
//    abstract fun sleep ()

}
class Child( name : String, age : Int) : Person( name = name, age = age) {
    override val name : String = ""

}




