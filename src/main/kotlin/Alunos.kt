class Alunos (var primeiroNome: String?, var ultimoNome: String? = null) {

    var codigoAluno = 0
    var mediaAluno = 0.0
    var ano = 0
    val foiAprovado: Boolean
        get(){
            if (mediaAluno >=60){
                return true
            }else{
                return false
            }
        }

    constructor(primeiroNome: String?, ultimoNome: String?, codigoAluno: Int):
            this(primeiroNome, ultimoNome){
                this.codigoAluno = codigoAluno
            }
    constructor(primeiroNome: String?, ultimoNome: String?, codigoAluno: Int, mediaAluno: Double, ano : Int):
            this(primeiroNome, ultimoNome, codigoAluno){
                this.ano = ano
                this.mediaAluno = mediaAluno
            }


    fun nomeCompleto(){
        println("$primeiroNome $ultimoNome")
    }

    fun passouDeAno() : Int{
        if (foiAprovado){
            ano +=1
            println("Parabéns, você passou de ano $ano")
        }else{
            println("Reprovado")
        }
        return 0
    }

    fun infoAluno(){
        println("Nome: $primeiroNome $ultimoNome")
        println("Código: $codigoAluno")
        println("Média: $mediaAluno")
        println("Próximo ano: $ano")
    }


}