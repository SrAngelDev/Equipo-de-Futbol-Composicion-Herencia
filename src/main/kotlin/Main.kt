package srangeldev

import srangeldev.models.Entrenador
import srangeldev.models.Jugador
import srangeldev.models.JugadorDefensa
import srangeldev.models.JugadorDelantero
import srangeldev.models.JugadorMedio
import srangeldev.models.JugadorPortero
import srangeldev.models.Marcar
import srangeldev.models.PosicionDefensa
import srangeldev.models.PosicionDelantero
import srangeldev.models.PosicionMedio
import srangeldev.models.PosicionPortero

fun main() {
    val entrenador = Entrenador(nombre = "Pedro", apellido = "Castro", edad = 33)

    val portero = JugadorPortero(dorsal = 1, posicion = PosicionPortero())
    val defensa = JugadorDefensa(dorsal = 4, posicion = PosicionDefensa())
    val mediocentro = JugadorMedio(dorsal = 8, posicion = PosicionMedio())
    val delantero = JugadorDelantero(dorsal = 7, posicion = PosicionDelantero())

    // Todos pueden entrenar
    entrenador.entrenar()
    portero.entrenar()
    defensa.entrenar()
    mediocentro.entrenar()
    delantero.entrenar()

    // Solo los que pueden jugar, es decir los jugadores
    portero.jugar()
    defensa.jugar()
    mediocentro.jugar()
    delantero.jugar()

    // Cambiar la posición del delantero a portero
    delantero.cambiarPosicion(PosicionPortero())
    delantero.jugar()

    // Convertir un jugador en entrenador
    val jugadorEntrenador = delantero.convertirseEnEntrenador("Carlos", "Fernández", 30)
    jugadorEntrenador.entrenar()
}




