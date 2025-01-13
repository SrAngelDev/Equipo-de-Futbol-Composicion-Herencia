package srangeldev.models

class JugadorMedio(dorsal: Int, posicion: Posicion) : Jugador(dorsal, posicion), Distribuir, Posicion {
    override fun distribuir() {
        println("Distribuyendo el juego como mediocampista")
    }

    override fun jugar() {
        println("Jugando como mediocampista")
    }

    override fun entrenar() {
        println("Entrenando como mediocampista")
    }

    override fun posicion() {
        println("Tengo posicion de mediocampista")
    }
}