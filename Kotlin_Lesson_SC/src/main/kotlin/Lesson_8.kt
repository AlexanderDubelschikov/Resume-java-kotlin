//Наследование и перечисление
////Lesson_0_7

class Lesson_8 : MainLesson_7(){
    override val info: String
        get() = "Lesson 8 class"

    override fun printInfo(person: Lesson_6) {
        super.printInfo(person)
        println("Class 8 PrintInfo")
    }
}