package meu.modelo;

import java.util.ArrayList;

public class Turma{
    private ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAlunoTurma(Aluno aluno){
        alunos.add(aluno);
    }

    public int qtdAlunoTurma(){
        return alunos.size();
    }

    public double calcularMediaTurma(){
        double somaMediasAlunos = 0.0;
        double mediaTurma = 0.0;

        for(Aluno aluno : alunos) {
            
            somaMediasAlunos = somaMediasAlunos + aluno.calcularMedia();

        }
        
        mediaTurma = somaMediasAlunos/qtdAlunoTurma();
        
        return  mediaTurma;
    }

}