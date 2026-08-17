//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.PedidoProduto;

public class Pedido {
    private ListaProdutos produtos;

    public Pedido() {
        this.produtos = new ListaProdutos();
    }

    public void adicionarProduto(Produto produto) {
        produtos.adicionar(produto);
    }

    public double calcularValor() {
        double total = 0.0;
        for (int i = 0; i < produtos.tamanho(); i++) {
            Produto p = produtos.get(i);
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

    public ListaProdutos getProdutos() { return produtos; }

    public void exibirPedido() {
        System.out.println("=== PEDIDO ===");
        for (int i = 0; i < produtos.tamanho(); i++) {
            System.out.println(produtos.get(i));
        }
        System.out.println("Total: R$" + String.format("%.2f", calcularValor()));
    }
}
