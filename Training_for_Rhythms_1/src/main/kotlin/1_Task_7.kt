//Имеется N кг металлического сплава. Из него изготавливают заготовки массой K кг каждая. После этого из
// каждой заготовки вытачиваются детали массой M кг каждая (из каждой заготовки вытачивают максимально возможное
// количество деталей). Если от заготовок после этого что-то остается, то этот материал возвращают к началу
// производственного цикла и сплавляют с тем, что осталось при изготовлении заготовок. Если того сплава,
// который получился, достаточно для изготовления хотя бы одной заготовки, то из него снова изготавливают
// заготовки, из них – детали и т.д. Напишите программу, которая вычислит, какое количество деталей может быть
// получено по этой технологии из имеющихся исходно N кг сплава.

fun main(args:Array<String>){
    var str = readLine()
    var list = str!!.split(" ")
    var a = list[0].toInt()
    var b = list[1].toInt()
    var c = list[2].toInt()
    var d = 0
    var e = 0
    var i = 0
    if (a == 0 || b == 0 || c == 0 || c>b || b>a)
        a=-10
    while(a>=b){
        d = a / b
        e = (b / c) * d
        a = a - (c * e)
        i = i + e
    }
    println(i)
}