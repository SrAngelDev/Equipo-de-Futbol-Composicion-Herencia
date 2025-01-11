package srangeldev

import srangeldev.models.Entrenador
import srangeldev.models.Jugador
import srangeldev.models.JugadorDefensa
import srangeldev.models.JugadorDelantero
import srangeldev.models.JugadorMedio
import srangeldev.models.JugadorPortero

fun main() {
    val entrenador = Entrenador(nombre = "Pedro", apellido = "Castro", edad = 33)
    val portero = JugadorPortero(dorsal = 1)
    val defensa = JugadorDefensa(dorsal = 4)
    val mediocentro = JugadorMedio(dorsal = 8)
    val delantero = JugadorDelantero(dorsal = 7)

    entrenador.entrenar()
    portero.entrenar()
    defensa.entrenar()
    mediocentro.entrenar()
    delantero.entrenar()

    portero.jugar()
    defensa.jugar()
    mediocentro.jugar()
    delantero.jugar()

}