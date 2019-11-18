package javaObserver

import java.util.*

class JogoDeFutebol(private val timeDaCasa: Time, private val timeVisitante: Time) : Observable() {

    private lateinit var t: Time
    val placar: MutableMap<Time, Int> = mutableMapOf(timeDaCasa to 0, timeVisitante to 0)

    fun notificarInicioDoJogo() {
        setChanged()
        notifyObservers("O Jogo Começou")
    }

    fun notificarGol(time: Time) {
        if (time == timeDaCasa) {
            placar[timeDaCasa] = placar[timeDaCasa]!! + 1
        } else if (time == timeVisitante) {
            placar[timeVisitante] = placar[timeVisitante]!! + 1
        }
        t = time

        setChanged()
        notifyObservers(
            "Goooool do ${t.nome} - Placar: ${timeDaCasa.nome} " +
                    "${placar.values.toIntArray()[0]} X ${placar.values.toIntArray()[1]} ${timeVisitante.nome}"
        )
    }

    fun notificarFimDoJogo() {
        setChanged()
        notifyObservers(
            "O Jogo acabou - Placar: " +
                    "${timeDaCasa.nome} ${placar.values.toIntArray()[0]} X ${placar.values.toIntArray()[1]} ${timeVisitante.nome}"
        )
    }
}
