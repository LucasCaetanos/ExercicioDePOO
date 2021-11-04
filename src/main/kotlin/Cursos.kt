class Cursos (var nomeCurso: String?, var serie : Int) {
    var professor: String? = null

    val listaAlunos = mutableListOf<Alunos>()

    fun matricularAlunos(aluno: Alunos){
        listaAlunos.add(aluno)
    }


    fun descadastro(aluno: Alunos){
        println("Você quer remover o cadastro do AlunO?" +
                "Informe Sim para prosseguir e não para desistir ")
        aluno.infoAluno()
        var confirmaRemocao = readLine()!!.uppercase()

        if (confirmaRemocao == "SIM"){
            listaAlunos.remove(aluno)
        }else{
            println("Cancelado")
        }
    }

    fun quantosAlunos(): Int{
        return listaAlunos.size
    }

    fun maiorMedia(): Double{
        var melhorNota = 0.0
        for (aluno in listaAlunos){
            if (aluno.mediaAluno > melhorNota){
                melhorNota = aluno.mediaAluno
            }
        }
        return melhorNota
    }


}