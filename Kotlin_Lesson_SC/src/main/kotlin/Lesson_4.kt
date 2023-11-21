//Массив данных

fun main(args: Array<String>)
{
    var items: Array<Int> = arrayOf(5,7,12,0)
    var items_list = listOf(12,7,12,0)
    var user: Map<String, Any> = mapOf("Name" to "Alexander", "Age" to 24)
    var items_list_mu = mutableListOf<Any>(10,125,25,64,765)
    //val someArray = arrayOf(1)
    println(items[0])
    println(items.get(1))
    println(items.size)//кол-во элементов
    items.set(0,10)
    println(items.get(0))
    println("=================")

    //println(items_list.lastIndexOf(12))
    //println(items_list.indexOf(12))
    items_list_mu.add("John")

    println("=================")
    /*for (el in items) {
        println(el)
    }*/

    /*items.forEach {el ->
        println(el)
    }*/

    /*items.forEachIndexed {index, el->
        println("$index $el")
    }*/

    user.forEach{ key, el->
        println("$key $el")
    }


}