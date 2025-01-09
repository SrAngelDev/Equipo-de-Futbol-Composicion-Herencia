package srangeldev.models

class JugadorDelantero(dorsal: Int) : Jugador(dorsal), Marcar {
    override fun marcar() {
        println("Marcando goles como delantero")
    }

    override fun jugar() {
        println("Jugando como delantero")
    }

    override fun entrenar() {
        println("Entrenado como delantero")
    }
}