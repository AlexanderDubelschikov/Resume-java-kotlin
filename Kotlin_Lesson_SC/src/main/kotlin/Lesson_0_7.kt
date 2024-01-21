fun main(args: Array<String>){

    val user_06 = Lesson_6("Alexander", "Dubelschikov")
    val user_07 = Lesson_8()
    val user_07_2 = Main2Lesson_7()

    //user_07.printInfo(user_06)
    //println(user_07.getConnection())
    checkDataTypes(user_07)
    //user_07_2.printInfo(Lesson_6())

}

fun checkDataTypes(obj: MainLesson_7){
    if(obj is Lesson_7){
        obj.printInfo(Lesson_6())
    }

    if(obj is Lesson_7_2){
        println(obj.getConnection())
    }

}