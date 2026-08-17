//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.MoedaCofre;

public class Moeda {
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return "Moeda de R$" + String.format("%.2f", valor);
    }
}