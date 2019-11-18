package myObserver

fun main() {

    val timeDaCada = Time("Flamengo")
    val timeVisitante = Time("Vasco")

    val jogoDeFutebol = JogoDeFutebol(timeDaCada, timeVisitante)

    Torcedor("Raphael", jogoDeFutebol)
    Torcedor("Maria", jogoDeFutebol)

    jogoDeFutebol.notificarInicioDoJogo()
    jogoDeFutebol.notificarGol(timeDaCada)

    Torcedor("Thainan", jogoDeFutebol)
    Torcedor("João", jogoDeFutebol)
    Torcedor("Lorena", jogoDeFutebol)
    Torcedor("Loirinha", jogoDeFutebol)

    jogoDeFutebol.notificarGol(timeVisitante)

    jogoDeFutebol.notificarGol(timeDaCada)

    jogoDeFutebol.notificarFimDoJogo()
}








