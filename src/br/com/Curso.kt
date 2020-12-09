package br.com

class Curso (val codigo: Int, val nome:String, val qtdMaximaAluno: Int)  {

    /*var professorAdjunto=ProfessorAdjunto()
    var professorTitular=ProfessorTitular()*/



   var digitalHouseManager = DigitalHouseManager()
    fun adicionarUmAluno(umAluno: Aluno): Boolean{

        if (digitalHouseManager.listaAluno.size<=qtdMaximaAluno) {
            digitalHouseManager.listaAluno.add(umAluno)
            return true
        }else {
            println("Quantidade máxima de aluno atingida para esse curso")
            return false
        }
    }
    fun excluirAluno(umAluno: Aluno){

        if (umAluno!=null)
            digitalHouseManager.listaAluno.remove(umAluno)

            }



}