fun main(args: Array<String>) {
    var cadena: String
    var vocales = 0
    var a_vocales=0
    var e_vocales=0
    var i_vocales=0
    var o_vocales=0
    var u_vocales=0


    println("Teclee una frase o palabra:")
     cadena = readLine().toString()

    cadena = cadena.toLowerCase()
    for (i in 0..cadena.length - 1) {
        val ch = cadena[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u'
        ) {
            ++vocales

        }
        if (ch=='a') {
            ++a_vocales
        }
        if (ch=='e')
        {
            ++e_vocales
        }
        if (ch=='i')
        {
            ++i_vocales
        }
        if (ch=='o')
        {
            ++o_vocales
        }
        if (ch=='u')
        {
            ++u_vocales
        }
    }



    println("Vocales totales: $vocales")
    println("Vocales a: $a_vocales")
    println("Vocales e: $e_vocales")
    println("Vocales i: $i_vocales")
    println("Vocales o: $o_vocales")
    println("Vocales u: $u_vocales")

}