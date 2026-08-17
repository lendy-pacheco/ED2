package TAD.MoedaCofre;

public class Main {
    public static void main(String[] args) {
        Moeda moeda1 = new Moeda(0.25);
        Moeda moeda2 = new Moeda(0.50);
        Moeda moeda3 = new Moeda(1.00);

        Cofre cofre = new Cofre();
        cofre.adicionar(moeda1);
        cofre.adicionar(moeda2);
        cofre.adicionar(moeda3);

        cofre.exibirCofre();
        System.out.printf("O valor total é: R$%.2f%n", cofre.calcularTotal());
    }
}
