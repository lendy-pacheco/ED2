//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Aluno;

public class Aluno {
    private String ra;
    private String nome;
    private String turma;
    private ListaNotas notas;

    public Aluno(String ra, String nome, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.turma = turma;
        this.notas = new ListaNotas();
    }

    public void inserirNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.adicionar(nota);
        } else {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        if (notas.vazio()) {
            return 0.0;
        }
        double soma = 0.0;
        for (int i = 0; i < notas.tamanho(); i++) {
            soma += notas.get(i);
        }
        return soma / notas.tamanho();
    }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }
    public ListaNotas getNotas() { return notas; }

    @Override
    public String toString() {
        return "Aluno: " + nome + " (RA: " + ra + ") - Média: " + String.format("%.2f", calcularMedia());
    }
}