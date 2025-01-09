package srangeldev.models

class JugadorMedio(dorsal: Int) : Jugador(dorsal), Distribuir {
    override fun distribuir() {
        println("Distribuyendo el juego como mediocampista")
    }

    override fun jugar() {
        println("Jugando como mediocampista")
    }

    override fun entrenar() {
        println("Entrenando como mediocampista")
    }
}