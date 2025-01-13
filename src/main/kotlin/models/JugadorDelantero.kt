package srangeldev.models

class JugadorDelantero(dorsal: Int, posicion: Posicion) : Jugador(dorsal, posicion), Marcar, Posicion {
    override fun marcar() {
        println("Marcando goles como delantero")
    }

    override fun jugar() {
        println("Jugando como delantero")
    }

    override fun entrenar() {
        println("Entrenado como delantero")
    }
    override fun posicion() {
        println("Tengo posicion de delantero")
    }
}