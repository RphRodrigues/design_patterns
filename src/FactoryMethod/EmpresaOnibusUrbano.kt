package FactoryMethod

import java.util.*

class EmpresaOnibusUrbano : Empresa() {

    override fun emitePassagem(origem: String, destino: String, dataHoraPartida: Calendar): Passagem {
        return PassagemOnibusUbano(origem, destino, dataHoraPartida)
    }
}