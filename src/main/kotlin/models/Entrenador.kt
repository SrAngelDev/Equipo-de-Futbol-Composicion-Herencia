package srangeldev.models

class Entrenador(
    val nombre: String,
    val apellido: String,
    val edad: String
): EquipoFutbol() {
    override fun entrenar() {
        println("Entrenando como entrenador")
    }
}