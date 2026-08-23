//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Animal;

public class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, String cor, int numeroPatas, String raca) {
        super(nome, cor, numeroPatas);
        this.raca = raca;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de patas: " + this.numeroPatas);
        System.out.println("Raça: " + this.raca);
    }
}
