
fun main() {
    val strings = listOf("Jan", "Carlos", "Contreras", "Sena", "Hola")
    val sortedStrings = strings.sortedBy { it.length }
    println(sortedStrings)
}
