//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.MoedaCofre;

public class Cofre {
    private ListaMoedas moedas;

    public Cofre() {
        this.moedas = new ListaMoedas();
    }

    public void adicionar(Moeda moeda) {
        moedas.adicionar(moeda);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < moedas.tamanho(); i++) {
            total += moedas.get(i).getValor();
        }
        return total;
    }

    public ListaMoedas getMoedas() { return moedas; }

    public void exibirCofre() {
        System.out.println("=== COFRE ===");
        for (int i = 0; i < moedas.tamanho(); i++) {
            System.out.println(moedas.get(i));
        }
        System.out.println("Total: R$" + String.format("%.2f", calcularTotal()));
    }
}
