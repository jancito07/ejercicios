fun main(args: Array<String>) {

    var numero: Int
    println("Teclee un número entre 1 y 9999:")

    numero = readLine()?.toInt() as Int

    if(numero >=1 && numero <= 9999){
        var unidad: Int = numero/1
        var decena:Int = numero/10
        var centena:Int = numero/100
        var u_millar:Int = numero/1000

        println("U: $unidad")
        println("D: $decena")
        println("C: $centena")
        println("UM: $u_millar")
    }
}