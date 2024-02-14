/*import kotlin.math.max
import kotlin.math.min

//Дан список, заполненный произвольными целыми числами. Найдите в этом списке два числа, произведение которых максимально. Выведите эти числа в порядке неубывания.
//Список содержит не менее двух элементов. Числа подобраны так, что ответ однозначен.
//Решение должно иметь сложность O(n), где n - размер списка.

fun main(args:Array<String>){

}

fun solve_6(mass: MutableList<Int>):Pair<Int,Int>
{
    var min1 = min(mass[0], mass[1])
    var min2 = max(mass[0], mass[1])
    var max1 = max(mass[0], mass[1])
    var max2 = min(mass[0], mass[1])
    var result_1 = 0
    var result_2 = 0

    for (i in 2 until mass.size)
    {
        if(mass[i]<=min2 && mass[i]>min1)
        {
            min2 = mass[i]
        }
        else if (mass[i]<=min1)
        {
            var help = min1
            min1 = mass[i]
            min2 = help
        }

        if(mass[i]>=max2 && mass[i]<max1)
        {
            max2 = mass[i]
        }
        else if (mass[i]>=max1)
        {
            var help = max1
            max1 = mass[i]
            max2 = help
        }
    }

    if (min1*min2>max1*max2)
    {
        result_1 = min1
        result_2 = min2
    }
    else
    {
        result_1 = max1
        result_2 = max2
    }

    return result_1, result_2
}*/