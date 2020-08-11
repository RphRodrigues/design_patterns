package FactoryMethod

import java.util.*

fun main() {

    val empresaUbana = EmpresaOnibusUrbano()

    val empresaInterestadual = EmpresaOnibusInterestadual()

    val passagemUrbana = empresaUbana.emitePassagem(
        "Rio de Janeiro",
        "Saquarema",
        GregorianCalendar(2020, Calendar.AUGUST, 10, 20, 0, 0)
    )

    val passagemInterestadual = empresaInterestadual.emitePassagem(
        "Rio de Janeiro",
        "São Paulo",
        GregorianCalendar(2020, Calendar.AUGUST, 1, 8, 0, 0)
    )

    passagemUrbana.detalhesPassagem()
    passagemInterestadual.detalhesPassagem()
}