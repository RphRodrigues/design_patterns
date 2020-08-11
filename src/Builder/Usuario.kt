package Builder

class Usuario private constructor(builder: Builder) {

    private val nome: String? = builder.getNome()
    private val sobrenome: String? = builder.getSobrenome()
    private val dataNascimento: String? = builder.getDataNascimento()

    class Builder {
        private var nome: String? = null
        private var sobrenome: String? = null
        private var dataNascimento: String? = null

        fun setNome(nome: String): Builder {
            this.nome = nome
            return this
        }

        fun getNome(): String? {
            return this.nome
        }

        fun setSobrenome(sobrenome: String): Builder {
            this.sobrenome = sobrenome
            return this
        }

        fun getSobrenome(): String? {
            return this.sobrenome
        }

        fun setDataNascimento(dataNascimento: String): Builder {
            this.dataNascimento = dataNascimento
            return this
        }

        fun getDataNascimento(): String? {
            return this.dataNascimento
        }

        fun build(): Usuario {
            return Usuario(this)
        }
    }

    override fun toString(): String {
        return "Usuario(nome=$nome, sobrenome=$sobrenome, dataNascimento=$dataNascimento)"
    }
}