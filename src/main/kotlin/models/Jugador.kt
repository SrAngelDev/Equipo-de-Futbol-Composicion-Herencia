package srangeldev.models

abstract class Jugador(
    val dorsal: Int,
): EquipoFutbol() {
    abstract fun jugar()
    override fun entrenar() {
        println("Entrenando como jugador")
    }
}