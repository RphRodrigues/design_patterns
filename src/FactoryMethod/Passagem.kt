package FactoryMethod

import java.text.SimpleDateFormat
import java.util.*

abstract class Passagem(
    var origem: String,
    var destino: String,
    var dataHoraPartida: Calendar
) {
    val df: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm")

    abstract fun detalhesPassagem()
}

