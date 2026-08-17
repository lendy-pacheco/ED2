//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Aluno;

public class ListaNotas {
    private double[] notas;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaNotas() {
        notas = new double[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public void adicionar(double nota) {
        if (tamanho == notas.length) {
            double[] novoArray = new double[notas.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = notas[i];
            }
            notas = novoArray;
        }
        notas[tamanho] = nota;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public double get(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return notas[posicao];
    }

    public boolean vazio() {
        return tamanho == 0;
    }
}
