package FactoryMethod

import java.util.*

abstract class Empresa {
    abstract fun emitePassagem(origem: String, destino: String, dataHoraPartida: Calendar): Passagem
}