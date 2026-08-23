//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Veiculo;

public class Veiculo extends Motor {
    public int ano;
    public float preco;

    public Veiculo(int ano, float preco, Motor motor) {
        super(motor.cilindradas, motor.potencia);
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);
    }
    
}
