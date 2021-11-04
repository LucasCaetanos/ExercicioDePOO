import cursos.Cursos


fun main() {

    val alunoTeste = Estudante("Julio", "Cesar", 1212, 70.0, 7)
    val daniel = Estudante("Daniel", "Pereira", 1212, 90.0, 7)





    val cursoTeste = Cursos("Filosofia", "Carlos", 7)
    val cursoMatematica = Cursos("Matematica", "Antonia", 6)



    //    cursoTeste.matricularEstudante(alunoTeste)
    //    cursoTeste.matricularEstudante(daniel)


    try {
        cursoMatematica.verificarAluno(daniel)
        cursoMatematica.verificarAluno(alunoTeste)
    }catch (e: Exception){
        println(e.message)
    }



}