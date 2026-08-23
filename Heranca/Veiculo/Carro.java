//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Veiculo;

public class Carro extends Veiculo {
    public String cor;
    public String modelo;

    Carro(int ano, float preco, Motor motor, String cor, String modelo) {
        super(ano, preco, motor);
        this.cor = cor;
        this.modelo = modelo;
    }
    
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
    }
}
