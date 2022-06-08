package ooComposicao;

import java.io.IOException;

public class CursoTeste {
    
    public static void main(String[] args) throws IOException {

        clearConsole();
        
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        System.out.println();
        System.out.println("Turma 1: "+ curso1.nome);
        for (Aluno aluno: curso1.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println();
        System.out.println("Turma 2: " + curso2.nome);
        for (Aluno aluno: curso2.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println();
        System.out.println("Turma 3: " + curso3.nome);
        for (Aluno aluno: curso3.alunos){
            System.out.println(aluno.nome);
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }

    public final static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");
            if (os=="Windows"){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
            }
        }catch(final Exception e){

        }
    }
}
