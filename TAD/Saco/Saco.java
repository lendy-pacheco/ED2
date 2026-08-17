package TAD.Saco;

public interface Saco<T> extends Iterable<T> {
    public void inserir(T item);
    public boolean vazio();
    public boolean remover(T item);
    public int tamanho();
    public boolean contem(T item);
    public void limpar();
}

