//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package Heranca.Pessoa;

public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public PessoaJuridica(int identificador, String nome, String cnpj) {
        super(identificador, nome);
        this.cnpj = cnpj;
    }
}
