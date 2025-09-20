fun main()
{
    println("Введите первое число: ")
    val number1 = readln().toInt()
    println("Введите второе число: ")
    val number2 = readln().toInt()
    if (number1>number2){
        println("Первое больш")
    }
    else if (number1== number2){
        println("Равны")
    }
    else{
        println("Второе больше")
    }
    val max = if(number1> number2) number1 else number2

    val month = readln().toInt()
    if (month in 1..12) {
        println("Ваш месяц под номером $month соответствует месяцу ")
    }
    if (month == 1) println("Январь")
    else if (month == 2) println("Февраль")
    else if (month == 3) println("Март")
    else if (month == 4) println("Апрель")
    else if (month == 5) println("Май")
    else if (month == 6) println("Июнь")
    else if (month == 7) println("Июль")
    else if (month == 8) println("Август")
    else if (month == 9) println("Сентябрь")
    else if (month == 10) println("Октябрь")
    else if (month == 11) println("Ноябрь")
    else if (month == 12) println("Декабрь")
    println(max)
}
