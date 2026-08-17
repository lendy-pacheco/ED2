//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.MoedaCofre;

public class ListaMoedas {
    private Moeda[] moedas;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaMoedas() {
        moedas = new Moeda[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public void adicionar(Moeda moeda) {
        if (tamanho == moedas.length) {
            Moeda[] novoArray = new Moeda[moedas.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = moedas[i];
            }
            moedas = novoArray;
        }
        moedas[tamanho] = moeda;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public Moeda get(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return moedas[posicao];
    }

    public boolean vazio() {
        return tamanho == 0;
    }
}
