data class Estudantes (var primeiroNome: String, var nota: Double){
    constructor(primeiroNome: String, nota: Double, ano: Int):
            this(primeiroNome, nota){
        this.ano = ano
    }

    var ultimoNome = ""
    var ra = 0
    var ano = 0

    fun printNomeCompleto() {
        println("$primeiroNome + $ultimoNome")
    }

    fun avalNota(): Int {
        val aprovado = nota
        if (nota >= 60) {
            println("Você foi aprovado com a nota $nota")
            return 1
        }else {
            println("Você foi reprovado com a nota $nota")
            return 0
        }
    }
    fun passouDeAno() {
        if(nota >= 60)
            ano += 1
        println("Parabéns")
    }
}