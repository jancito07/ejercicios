fun main(args: Array<String>) {


    println("Ingrese el primer lado del triangulo: ")
    var lado1 = readLine()!!.toInt()
    println("Ingrese el segundo lado del triangulo: ")
    var lado2 = readLine()!!.toInt()
    println("Ingrese el tercer lado del triangulo: ")
    var lado3 = readLine()!!.toInt()

    if(lado1 == lado2 && lado2 == lado3){
        println("El triángulo es equilátero")
    }else if(lado1 == lado2 && lado2 != lado3){
        println("El triángulo es isosceles")
    }else if(lado1 == lado3 && lado3 != lado2){
        println("El triángulo es isosceles")
    }else if(lado2 == lado3 && lado3 != lado1){
        println("El triángulo es isosceles")
    }else{
        println("El triángulo es escaleno")
    }
}