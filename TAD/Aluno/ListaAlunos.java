//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Aluno;

public class ListaAlunos {
    private Aluno[] alunos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaAlunos() {
        alunos = new Aluno[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public void adicionar(Aluno aluno) {
        if (tamanho == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = alunos[i];
            }
            alunos = novoArray;
        }
        alunos[tamanho] = aluno;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public Aluno get(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return alunos[posicao];
    }

    public boolean vazio() {
        return tamanho == 0;
    }
}
