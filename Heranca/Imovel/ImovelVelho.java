//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Imovel;

public class ImovelVelho extends Imovel {
    public double desconto;

    public ImovelVelho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double calcularPreco(){
        return this.preco - this.desconto;
    }
}
