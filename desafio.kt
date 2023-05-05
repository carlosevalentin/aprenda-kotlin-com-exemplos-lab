// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String) {
    override fun toString(): String {
        return "Nome: $nome"
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario("Carlos")
    val usuario2 = Usuario("Eduardo")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120, Nivel.INTERMEDIARIO)

    val formacao = Formacao("Ciência da Computação", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

   println("Inscritos:")
    for (inscrito in formacao.inscritos) {
        println("- ${inscrito.nome}")
    }

    println("\nConteúdos:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome} (${conteudo.duracao} minutos, nível ${conteudo.nivel})")
    }
}
