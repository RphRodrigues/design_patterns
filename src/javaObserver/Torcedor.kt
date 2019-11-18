package javaObserver

import java.util.*

internal class Torcedor(private var nome: String, observable: Observable) : Observer {

    init {
        observable.addObserver(this)
        print("Torcedor $nome registrado\n")
    }

    override fun update(o: Observable?, arg: Any?) {
        print("Torcedor $nome recebe notificação: $arg \n")
    }
}