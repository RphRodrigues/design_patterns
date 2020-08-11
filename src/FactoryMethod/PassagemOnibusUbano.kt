package FactoryMethod

import java.util.*

class PassagemOnibusUbano(
    origem: String,
    destino: String,
    dataHoraPartida: Calendar
) : Passagem(origem, destino, dataHoraPartida) {

    override fun detalhesPassagem() {
        println("origem=${this.origem} - destino=${this.destino} - dataHora=${super.df.format(this.dataHoraPartida.time)}")
    }
}