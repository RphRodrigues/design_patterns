package Builder

fun main() {

    val usuario = Usuario.Builder()
        .setNome("Raphael")
        .setSobrenome("Rodrigues")
        .setDataNascimento("01/10/1992")
        .build()

    print(usuario)

}