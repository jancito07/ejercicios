fun main() {

    println("Ingresa un palindromo:")
    var texto = readLine().toString()
    if (texto != null) {
        texto = texto.toLowerCase()
        texto = texto.replace("\\s".toRegex(), "")
        var longitud = texto.length
        var igual = true
        var cont = 0
        for (ind in longitud - 1 downTo 0) {
            if (texto[ind] != texto[cont]) {
                igual = false
                break
            }
            cont++
        }
        if (igual == true) {
            println("Muy bien la frase es un palindromo ")
        } else {
            println("La frase no es un palindromo ")
        }
    }
}