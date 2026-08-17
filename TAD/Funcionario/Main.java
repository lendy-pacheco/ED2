package TAD.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Funcionario f1 = new Funcionario("John", "Torres", 2500.0f);
        Funcionario f2 = new Funcionario("Guilherme", "Soares", 3000.0f);

        System.out.println("Salário anual do " + f1.getNome() + ": R$" + f1.salarioAnual());
        System.out.println("Salário anual do " + f2.getNome() + ": R$" + f2.salarioAnual());

        f1.aumentarSalario();
        f2.aumentarSalario();

        System.out.println("\nApós aumento de 10%:");
        System.out.println(f1);
        System.out.println(f2);

        s.close();
    }
}
