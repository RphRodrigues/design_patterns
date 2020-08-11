package FactoryMethod

import java.util.*

class PassagemOnibusInterestadual(origem: String, destino: String, dataHoraPartida: Calendar) :
    Passagem(origem, destino, dataHoraPartida) {

    override fun detalhesPassagem() {
        println("origem=${this.origem} - destino=${this.destino} - dataHora=${df.format(this.dataHoraPartida.time)}")
    }
}