package srangeldev.models

class JugadorDefensa(dorsal: Int, posicion: Posicion) : Jugador(dorsal, posicion), Defender, Posicion {
    override fun defender() {
        println("Defendiendo como defensa")
    }

    override fun jugar() {
        println("Jugando como defensa")
    }

    override fun entrenar() {
        println("Entrenado como defensa")
    }

    override fun posicion() {
        println("Tengo posicion de defensa")
    }
}