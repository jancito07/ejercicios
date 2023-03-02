fun main(args: Array<String>) {
    var decimalN: Int
println("Teclee un número:")
    decimalN= readLine()!!.toInt()

    val binario: String = Integer.toBinaryString(decimalN)


    println("Binario:$binario")


    val octal = Integer.toOctalString(decimalN)

    println("Octal: $octal")

    val hex = decimalN.toString(16)

    println("Hexadecimal: ${hex.toUpperCase()}")

}