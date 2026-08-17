//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Saco;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SacoVetor<T> implements Saco<T> {
    private Object[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public SacoVetor() {
        elementos = new Object[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public SacoVetor(int capacidadeInicial) {
        if (capacidadeInicial <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva");
        }
        elementos = new Object[capacidadeInicial];
        tamanho = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int posicao = 0;

            @Override
            public boolean hasNext() {
                return posicao < tamanho;
            }

            @Override
            @SuppressWarnings("unchecked")
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) elementos[posicao++];
            }
        };
    }

    @Override
    public void inserir(T item) {
        if (tamanho == elementos.length) {
            Object[] novoArray = new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, novoArray, 0, tamanho);
            elementos = novoArray;
        }
        elementos[tamanho] = item;
        tamanho++;
    }

    @Override
    public boolean vazio() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean remover(T item) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(item)) {
                for (int j = i; j < tamanho - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[tamanho - 1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contem(T item) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SacoVetor[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}