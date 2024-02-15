fun main(args:Array<String>)
{
    var mass = listOf<Long>(2L, 1L, 3L)
    var sortmass = mass.sorted()
    for(i in 0 until mass.size)
    {
        println(sortmass[i])
    }
}