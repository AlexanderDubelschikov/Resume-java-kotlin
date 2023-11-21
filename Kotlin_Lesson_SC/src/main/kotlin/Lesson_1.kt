//Переменные и типы данных

var hello = "Hello World"
fun main (args: Array<String>){
    var age: Int = 23
    age = 32
    println("Возраст: $age")

    var name: String = "John"
    var blood_type: Char = 'A'
    println("Возраст: $age Имя: $name Тип крови: $blood_type")

    var age_2: Float = 4.5f
    var age_3: Double = 4.252352
    var yes: Boolean = true
    yes = false

    val pi: Float = 3.14f
    //val = 3.2f

    var hero: Int? = null

    var name2 = "Alexander"
    var var1 = 4.5f
    var var2 = 1
    var blood_type_2 = 'B'

    var2+=10
    var2++
    var2--

    var res = hello + " " + name2
    println(res)


}