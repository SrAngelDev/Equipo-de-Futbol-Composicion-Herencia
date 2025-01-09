package srangeldev.models

class JugadorPortero(dorsal: Int) : Jugador(dorsal), Parar {
    override fun parar() {
        println("Parando como portero")
    }

    override fun jugar() {
        println("Jugando como portero")
    }

    override fun entrenar() {
        println("Entrenando como portero")
    }
}