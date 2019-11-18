package myObserver

interface Observado {
    fun registerObserver(observador: Observador)
    fun unRegisterObserver(observador: Observador)
    fun notifyAllObservers(notificacao: ENotificacao)
}