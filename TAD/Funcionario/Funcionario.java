//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Funcionario;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salarioMensal;

    public Funcionario(String nome, String sobrenome, float salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        if(salarioMensal < 0){
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public void aumentarSalario(){
        this.salarioMensal += this.salarioMensal * 0.10f;;
    }

    public float salarioAnual(){
        return this.salarioMensal * 12;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Float getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(Float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }   

    @Override
    public String toString() {
        return nome + " " + sobrenome + " - Salário: R$" + String.format("%.2f", salarioMensal);
    }
}
