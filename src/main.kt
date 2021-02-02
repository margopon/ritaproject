import kotlin.math.pow
import kotlin.math.sqrt

////рита понасенко
//

fun Integer1_1() { ////рита понасенко
    print("Введите расстояние в сантиметрах")
    var a = readLine()!!.toDouble()
    var b = a/100
    print("Количество полных метров= $b")
}


fun Begin2(){ ////рита понасенко
    print("Введите сторону квадрата:")
    var a = readLine()!!.toDouble()
    var S = a*a
    print("Площадь квадрата равна: $S")
}
//
fun Begin25() { ////рита понасенко
    print("Введите значение переменной х:")
    var x = readLine()!!.toDouble()
    var y = 3*x.pow(6)-6*x.pow(2)-7
    print("Значение выражения равно : $y")


}
fun Begin9(){ ////рита понасенко
    print("Введите два неотрицательных числа:")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = sqrt(a*b)
    print("Среднее геометрическое этих двух чисел равно: $c")
}
fun Integer13() {  ////рита понасенко
    print("Введите трехзначное число")
    var num = readLine()!!.toDouble()
    var sotni = num/100
    var des = num%100/10
    var edin = num%100%10
    print(num%100/10*100+num%100%10*10+num/100)

}

fun Integer23(){  ////рита понасенко
    print("Введите число секунд, прошедших с начала суток")
    var N = readLine()!!.toDouble()
    var min = N/60
    var hours = min/60
    var important = min-hours*60
    print ("Количество полных минут, прошедших с начала последнего часа: $important")
}
