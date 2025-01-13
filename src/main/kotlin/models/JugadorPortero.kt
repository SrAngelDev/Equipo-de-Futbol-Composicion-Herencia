package srangeldev.models

class JugadorPortero(dorsal: Int, posicion: Posicion) : Jugador(dorsal, posicion), Parar, Posicion {
    override fun parar() {
        println("Parando como portero")
    }

    override fun jugar() {
        println("Jugando como portero")
    }

    override fun entrenar() {
        println("Entrenando como portero")
    }

    override fun posicion() {
        println("Tengo posicion de portero")
    }
}