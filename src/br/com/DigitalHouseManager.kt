package br.com

class DigitalHouseManager {
    var listaAluno= mutableListOf<Aluno>()
    var listaCurso= mutableListOf<Curso>()
    var listaProfessor= mutableListOf<Professor>()
    var listaMatricula= mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int,
                        quantidadeMaximaDeAlunos: Int ){

        var curso= Curso(codigoCurso,nome,quantidadeMaximaDeAlunos)
        listaCurso.add(curso)

    }

}