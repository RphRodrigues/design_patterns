package myObserver

class JogoDeFutebol(private val timeDaCasa: Time, private val timeVisitante: Time) : Observado {

    private lateinit var timeQueMarcouGol: Time
    private val placar: Array<Int> by lazy { Array(2) { 0 } }

    private val observadores: MutableList<Observador> by lazy {
        mutableListOf<Observador>()
    }

    fun notificarInicioDoJogo() {
        notifyAllObservers(ENotificacao.InicioDoJogo)
    }

    fun notificarGol(time: Time) {
        if (time == timeDaCasa) {
            placar[0]++
        } else if (time == timeVisitante) {
            placar[1]++
        }
        timeQueMarcouGol = time
        notifyAllObservers(ENotificacao.Gol)
    }

    fun notificarFimDoJogo() {
        notifyAllObservers(ENotificacao.FimDoJogo)
    }

    override fun registerObserver(observador: Observador) {
        observadores.add(observador)
    }

    override fun unRegisterObserver(observador: Observador) {
        if (observadores.contains(observador)) {
            observadores.remove(observador)
        }
    }

    override fun notifyAllObservers(notificacao: ENotificacao) {
        when (notificacao) {
            ENotificacao.InicioDoJogo -> {
                for (observador in observadores) {
                    observador.update("O Jogo Começou\n")
                }
            }
            ENotificacao.Gol -> {
                observadores.forEach {
                    it.update(
                        "Goooool do ${timeQueMarcouGol.nome} - Placar: " +
                                "${timeDaCasa.nome} ${placar[0]} X ${placar[1]} ${timeVisitante.nome}\n"
                    )
                }
            }
            ENotificacao.FimDoJogo -> {
                observadores.forEach {
                    it.update(
                        "O Jogo acabou - Placar: " +
                                "${timeDaCasa.nome} ${placar[0]} X ${placar[1]} ${timeVisitante.nome}\n"
                    )
                }
            }
        }
    }
}
