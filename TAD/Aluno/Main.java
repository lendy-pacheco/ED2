//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Aluno;

public class Main {
    public static void main(String[] args) {
        ListaAlunos alunos = new ListaAlunos();

        Aluno a1 = new Aluno("RA001", "João Silva", "Turma A");
        Aluno a2 = new Aluno("RA002", "Maria Santos", "Turma B");
        Aluno a3 = new Aluno("RA003", "Pedro Oliveira", "Turma A");

        a1.inserirNota(8.5);
        a1.inserirNota(7.0);
        a1.inserirNota(9.5);

        a2.inserirNota(6.0);
        a2.inserirNota(7.5);
        a2.inserirNota(8.0);

        a3.inserirNota(9.0);
        a3.inserirNota(9.5);
        a3.inserirNota(10.0);

        alunos.adicionar(a1);
        alunos.adicionar(a2);
        alunos.adicionar(a3);

        System.out.println("=== MÉDIAS DOS ALUNOS ===");
        for (int i = 0; i < alunos.tamanho(); i++) {
            System.out.println(alunos.get(i));
        }
    }
}