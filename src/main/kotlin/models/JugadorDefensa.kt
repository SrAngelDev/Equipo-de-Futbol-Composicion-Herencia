package srangeldev.models

class JugadorDefensa(dorsal: Int) : Jugador(dorsal), Defender {
    override fun defender() {
        println("Defendiendo como defensa")
    }

    override fun jugar() {
        println("Jugando como defensa")
    }

    override fun entrenar() {
        println("Entrenado como defensa")
    }
}