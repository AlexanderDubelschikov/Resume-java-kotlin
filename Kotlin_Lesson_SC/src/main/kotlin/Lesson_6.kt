//Классы и объекты
//см. Lesson_0_6
//public
//private
//internal
//protected

class Lesson_6(var firstName: String = "Peter", var secondName: String = "Parker") {

    var login: String? = null
        set(value){
            if(value=="Codi")
                field = "None"
            else
                field = value
        }
        get(){
            val loginfield = field ?: "Неизвестно"
            println("Вызван геттер!")
            println ("Переменная равна: $loginfield")
            return field
        }

    fun printUser(){
        println("$firstName $secondName")
    }

    /*var firstName: String = "Alex"
    var secondName: String = "Marley"

    fun printUser()
    {println("$firstName $secondName")}*/

    //var _firstName:String = firstName
    //var _secondName:String = secondName

    /*init{
        _firstName = firstName
        _secondName = secondName
    }*/

   /*constructor(): this("Peter", "Parker"){
       println("Данные установлены конструктором по-умолчанию")
   }

    constructor(firstName: String): this(firstName, "Parker"){
        println("Данные установлены конструктором по-умолчанию")
    }*/
}