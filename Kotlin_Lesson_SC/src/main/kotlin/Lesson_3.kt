//Использование функций
fun sayHello():Unit
{
    println("Hello")
}

fun sayHello2(first:String, number:Int)
{
    println("Hello $first, your number $number")
}

fun add(x: Int, y: Int):Int
{
    return x+y
}

fun saySomething():String = "Hello world"

fun add_short(x: Int, y: Int): Int = x+y

fun main (args: Array<String>){
    sayHello()
    sayHello2("Alexander", 1)
    println(add(1,2))
    println(saySomething())
    println(add_short(5,5))
}