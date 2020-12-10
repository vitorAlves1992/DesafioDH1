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

    fun excluirCurso(codigoCurso: Int){

        for(c in listaCurso){

            if(c.codigo.equals(codigoCurso))
                listaCurso.remove(c)
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno:Int){

        var aluno= Aluno(nome,sobrenome,codigoAluno)
        listaAluno.add(aluno)
    }



    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){

            var tamanhoListaMatricula = listaMatricula.size
            for (c in listaAluno){
                for(d in listaCurso){
                    if (c.codigo.equals(codigoAluno)&&d.codigo.equals(codigoCurso)){
                        var matricula = Matricula(c,d)
                        listaMatricula.add(matricula)
                        println("Matrícula realizada")
                        tamanhoListaMatricula+=2
                    }
                }

        }

        if(tamanhoListaMatricula!=listaMatricula.size)
            println("não foi possível realizar a matrícula porque não há vagas.")
    }
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto:Int){

        for(p in listaProfessor){
            if(p.codigo.equals(codigoProfessorAdjunto)&&p.codigo.equals(codigoProfessorTitular)){

            }
        }


    }

}