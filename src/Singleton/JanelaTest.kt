package Singleton

fun main() {

    val janela = Janela.getInstance()

    println("dimensao: ${janela?.dimensao}")


    val janela2 = JanelaSingletonKotlin
    println("dimensao: ${janela2.dimensao}")
}