//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.PedidoProduto;

public class ListaProdutos {
    private Produto[] produtos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaProdutos() {
        produtos = new Produto[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public void adicionar(Produto produto) {
        if (tamanho == produtos.length) {
            Produto[] novoArray = new Produto[produtos.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = produtos[i];
            }
            produtos = novoArray;
        }
        produtos[tamanho] = produto;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public Produto get(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return produtos[posicao];
    }

    public boolean vazio() {
        return tamanho == 0;
    }
}
