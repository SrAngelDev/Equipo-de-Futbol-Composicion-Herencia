package srangeldev.models

abstract class Jugador(
    val dorsal: Int,
    var posicion: Posicion
): EquipoFutbol() {
    abstract fun jugar()
    override fun entrenar() {
        println("Entrenando como jugador")
    }
    fun cambiarPosicion(nuevaPosicion: Posicion) {
        posicion = nuevaPosicion
        println("Cambiando a la nueva posición a $posicion")
    }
    fun convertirseEnEntrenador(nombre: String, apellido: String, edad: Int): Entrenador {
        return Entrenador(nombre, apellido, edad)
    }
}