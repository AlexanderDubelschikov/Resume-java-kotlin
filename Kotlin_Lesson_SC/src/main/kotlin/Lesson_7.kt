//Абстрактные классы и интерфейсы
//Lesson_0_7

interface Lesson_7{
    val info: String
    fun printInfo(person: Lesson_6){
        println("First name: ${person.firstName}, SecondName: ${person.secondName}")
    }
}

interface Lesson_7_2{
    fun getConnection():String
}

open class MainLesson_7: Lesson_7, Lesson_7_2
{
    override fun getConnection(): String {
        return "DB Connected"
    }
    override val info: String
        get() = "Method Was Called"

    override fun printInfo(person: Lesson_6) {
        super.printInfo(person)
        println(info)
        println("Дополнительный код")
    }

}

class Main2Lesson_7: Lesson_7{

    override val info: String
        get() = "Method Was Called"
    override fun printInfo(person: Lesson_6) {
        println("Так, да не так! $info")
        super.printInfo(person)
    }
}