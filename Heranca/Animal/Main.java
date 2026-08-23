//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Passarinho", "Azul", 2);
        animal.exibirDados(); // exibe os atributos do animal
        Cachorro dog = new Cachorro("Rex", "Marrom", 4, "Vira lata");
        dog.exibirDados(); // exibe os atributos do cachorro
    }
}
