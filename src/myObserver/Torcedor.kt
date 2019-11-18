package myObserver

class Torcedor(private var nome: String, observado: Observado) : Observador {

    init {
        observado.registerObserver(this)
        print("Torcedor $nome registrado\n")
    }

    override fun update(texto: String) {
        print("Torcedor $nome recebe notificação: $texto\n")
    }
}