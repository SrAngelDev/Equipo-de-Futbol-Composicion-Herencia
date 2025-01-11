package srangeldev.models

class Entrenador(
    val nombre: String,
    val apellido: String,
    val edad: Int
): EquipoFutbol() {
    override fun entrenar() {
        println("Entrenando como entrenador")
    }
}