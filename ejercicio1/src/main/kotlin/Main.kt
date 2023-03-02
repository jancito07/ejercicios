fun main(args: Array<String>) {

    val vector: Array<Int> = arrayOf(2,4,1,6,5,9,0,3,7,8)



    val square = pow (num = vector[0])
    println("Pos0: $square")
    val square1 = pow (num = vector[1])
    println("Pos1: $square1")
    val square2 = pow (num = vector[2])
    println("Pos2: $square2")
    val square3 = pow (num = vector[3])
    println("Pos3: $square3")
    val square4 = pow (num = vector[4])
    println("Pos4: $square4")
    val square5 = pow (num = vector[5])
    println("Pos5: $square5")
    val square6 = pow (num = vector[6])
    println("Pos6: $square6")
    val square7 = pow (num = vector[7])
    println("Pos7: $square7")
    val square8 = pow (num = vector[8])
    println("Pos8: $square8")
    val square9 = pow (num = vector[9])
    println("Pos9: $square9")
}
fun pow(num: Int, pow: Int = 2):Int{
    var resultado: Int = 1
    for(i in 1..pow){
        resultado = resultado * num
    }
    return resultado
}