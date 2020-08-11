package FactoryMethod

import java.util.*

class EmpresaOnibusInterestadual : Empresa() {

    override fun emitePassagem(origem: String, destino: String, dataHoraPartida: Calendar): Passagem {
        return PassagemOnibusInterestadual(origem, destino, dataHoraPartida)
    }
}