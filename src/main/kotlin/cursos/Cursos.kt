package cursos

import Estudante
import java.lang.Exception

class Cursos (private var nomeCurso : String?,private var professor : String?,private var serie : Int){

    private val listaEstudantesMatriculados = mutableListOf<Estudante>()


    fun matricularEstudante(estudante: Estudante){
        listaEstudantesMatriculados.add(estudante)
    }

    @Override
    fun matricularEstudante(listaDeEstudantes : Array<Estudante>){
        for (estudante in listaDeEstudantes ){
            listaEstudantesMatriculados.add(estudante)
        }
    }

    fun descadastrarAluno(estudante: Estudante){
        println("Você realmente deseja remover o estudante abaixo? Digite Sim para" +
                " remover ou Não para desistir da remoção")
        estudante.mostraInformacoesAluno()
        var confirmaRemocao = readLine()!!.uppercase()

        if(confirmaRemocao == "SIM"){
            listaEstudantesMatriculados.remove(estudante)
            println("Estudante removido com sucesso")
        }else{
            println("Estudante não removido")
        }

    }

    fun contaEstudantesCadastrados() : Int{
        return listaEstudantesMatriculados.size
    }

    fun retornaMaiorMediaDoCurso() : Double{
        var melhorMedia = 0.0

        for (estudante in listaEstudantesMatriculados){
            if (estudante.mediaAluno > melhorMedia){
                melhorMedia = estudante.mediaAluno
            }
        }
        return melhorMedia
    }

    fun verificarAluno(estudante: Estudante){
        if (listaEstudantesMatriculados.contains(estudante)){
            println("Estudande está na lista")
        }else{
            throw Exception("O estudante não existe")
        }
    }


}