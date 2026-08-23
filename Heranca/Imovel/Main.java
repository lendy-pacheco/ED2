//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Imovel;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua Silva, 123", 300000.0);
        ImovelNovo imovel_novo = new ImovelNovo("Rua Joaquim, 999", 250000.0, 20000.0);
        ImovelVelho imovel_velho = new ImovelVelho("Av. Brasil, 777", 500000.0,35000.0);

        System.out.printf("Endereco: %s\n", imovel.endereco);
        System.out.printf("Preco: %f\n", imovel.preco);

        System.out.printf("Endereco: %s\n", imovel_novo.endereco);
        System.out.printf("Preco: %f\n", imovel_novo.preco);
        System.out.printf("Preco atual: %f\n", imovel_novo.calcularPreco());

        System.out.println(imovel_velho.endereco);
        System.out.printf("Preco: %f", imovel_velho.preco);
        System.out.printf("\nPreco atual: %f", imovel_velho.calcularPreco());
    }
}
