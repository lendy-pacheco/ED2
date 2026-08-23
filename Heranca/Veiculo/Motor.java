//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Veiculo;

public class Motor {
    public int cilindradas;
    public int potencia;

	public Motor(int cilindradas, int potencia) {
		this.cilindradas = cilindradas;
		this.potencia = potencia;
	}

    public void exibirDados(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Potência: " + this.potencia);
    }
}
