//Условные операторы
fun main(args: Array<String>){

    var word: String? = null
    var isHasCar = true

    //word = "Hello"
    //word = "No"

    if (word == null)
    {
        println("Переменная word равна null")
        if (isHasCar)
            println(isHasCar)
    }
    else if (word == "Hello")
        println("Переменная word равна: $word")
    else
        println("Ничто не истина")

    val number = 5
    when (number){
        null -> println("Нуль значение")
        5 -> println("5")
        else -> println("Нет совпадений")
    }

    /*val res = 0
    if (number>30)
        res = 1
    else
        res = 0*/

    var res = if(number > 30) 1 else 0
    val words = when(number){
        null -> "Ничего"
        else -> "Ура" }
    println(words)

}