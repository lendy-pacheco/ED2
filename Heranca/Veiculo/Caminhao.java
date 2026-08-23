//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Veiculo;

public class Caminhao extends Veiculo {
    public float comprimento;

	public Caminhao(int ano, float preco, Motor motor, float comprimento) {
		super(ano, preco, motor);
		this.comprimento = comprimento;
	}

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Comprimento: " + this.comprimento);
    }
}
