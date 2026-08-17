//Aluna: Lendy Naiara Carpio Pacheco - 10428525

package TAD.Saco;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SacoListaEncadeada<T> implements Saco<T> {
    
    private class No {
        T dado;
        No proximo;
        
        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    private No cabeca;
    private int tamanho;

    public SacoListaEncadeada() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private No atual = cabeca;

            @Override
            public boolean hasNext() {
                return atual != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T dado = atual.dado;
                atual = atual.proximo;
                return dado;
            }
        };
    }

    @Override
    public void inserir(T item) {
        No novo = new No(item);
        novo.proximo = cabeca;
        cabeca = novo;
        tamanho++;
    }

    @Override
    public boolean vazio() {
        return cabeca == null;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean remover(T item) {
        if (cabeca == null) {
            return false;
        }

        if (cabeca.dado.equals(item)) {
            cabeca = cabeca.proximo;
            tamanho--;
            return true;
        }

        No atual = cabeca;
        while (atual.proximo != null && !atual.proximo.dado.equals(item)) {
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            return false;
        }

        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return true;
    }

    @Override
    public boolean contem(T item) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado.equals(item)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    @Override
    public void limpar() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SacoListaEncadeada[");
        No atual = cabeca;
        while (atual != null) {
            sb.append(atual.dado);
            if (atual.proximo != null) {
                sb.append(", ");
            }
            atual = atual.proximo;
        }
        sb.append("]");
        return sb.toString();
    }
}