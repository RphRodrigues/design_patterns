package Singleton

class Janela private constructor() {

    var dimensao: Pair<Double, Double>? = null

    init {
        dimensao = Pair(640.0, 480.0)
    }

    companion object {
        private var janela: Janela? = null

        fun getInstance(): Janela? {

            if (janela == null) {
                janela = Janela()
            }
            return janela
        }
    }

}