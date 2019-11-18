package javaObserver

fun main() {

    val timeDaCada = Time("Flamengo")
    val timeVisitante = Time("Vasco")

    val jogoDeFutebol = JogoDeFutebol(timeDaCada, timeVisitante)

    Torcedor("José", jogoDeFutebol)
    Torcedor("Maria", jogoDeFutebol)

    jogoDeFutebol.notificarInicioDoJogo()
    jogoDeFutebol.notificarGol(timeDaCada)

    Torcedor("Lucia", jogoDeFutebol)

    jogoDeFutebol.notificarGol(timeDaCada)
    jogoDeFutebol.notificarFimDoJogo()
}








