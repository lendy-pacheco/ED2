package TAD.PedidoProduto;

public class Main {
    public static void main(String[] args) {
        Produto cafe = new Produto("Café solúvel", 5.50, 1);
        Produto arroz = new Produto("Arroz integral", 4.90, 2);
        Produto feijao = new Produto("Feijão preto", 2.80, 2);

        Pedido meuPedido = new Pedido();
        meuPedido.adicionarProduto(cafe);
        meuPedido.adicionarProduto(arroz);
        meuPedido.adicionarProduto(feijao);

        meuPedido.exibirPedido();
        System.out.printf("O valor total é: R$%.2f%n", meuPedido.calcularValor());
    }
}
