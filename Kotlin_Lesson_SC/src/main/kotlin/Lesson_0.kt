//Вспомогательный

fun main(args: Array<String>){
    val alex = Lesson_6("Alexander", "Dubelschikov")

    //println(alex.firstName)
    //println(alex.secondName)

    alex.printUser()
    alex.login = "Codi"
    println(alex.login)
    alex.login = "Codi2"
    println(alex.login)
    val peter = Lesson_6()
    peter.printUser()
    val bob = Lesson_6("Bob")
    bob.printUser()
    val keka = Lesson_6(secondName = "Keka")
    keka.printUser()

    peter.login


}