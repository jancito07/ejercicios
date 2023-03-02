fun factorial()
{
    println("Ingrese un número:")
    var num = readLine()!!.toInt()

    for (i in num-1 downTo 1)
    {
        num *= i
    }
    println("Factorial: $num")
}


fun main(args: Array<String>) {

    factorial()

}