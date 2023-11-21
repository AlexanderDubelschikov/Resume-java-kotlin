//Параметры в функции и циклы

fun printSome(item: String = "He-he", vararg word: Any){
    print("$item: ")
    word.forEach { el->
        print("$el ")
    }
    println()
}


fun main(args: Array<String>)
{
    var names = arrayOf("Bob", "Alex", "Kate")
    printSome(word = *names)
    printSome(word = *names, item = "NO-NO")
    printSome("Hey-hey", "My dear friend", 1 , true)
    printSome("Hey-hey", *names)

    var x = 10
    while(x<15)
    {
        x++
        println(x)
    }

    do
    {   x++
        println(x)
    } while(x<15)

    /*for (i in 0..3 step 1)
    {
        println(i)
    }*/

    /*for (i in 10 downTo 0 step 2 )
    {
        println(i)
    }*/

    /*for(el in 'a'..'z')
    {
        println(el)
    }*/

    /*for(el in 'z' downTo 'a' step 5 )
    {
        println(el)
    }*/

    val y = 20
    if (y !in 5..10)
    {
        println(y)
    }


}