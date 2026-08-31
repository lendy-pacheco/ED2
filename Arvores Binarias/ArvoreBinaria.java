import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class ArvoreBinaria {

    No raiz;

    // 1. Contar nós
    public int contarNos(No no) {

        if (no == null) {
            return 0;
        }

        return 1 + contarNos(no.esquerda)
                 + contarNos(no.direita);
    }

    // 2. Contar folhas
    public int contarFolhas(No no) {

        if (no == null) {
            return 0;
        }

        if (no.esquerda == null && no.direita == null) {
            return 1;
        }

        return contarFolhas(no.esquerda)
             + contarFolhas(no.direita);
    }

    // 3. Contar nós internos
    public int contarNosInternos(No no) {

        if (no == null) {
            return 0;
        }

        if (no.esquerda == null && no.direita == null) {
            return 0;
        }

        return 1
             + contarNosInternos(no.esquerda)
             + contarNosInternos(no.direita);
    }

    // 4. Percurso pré-ordem iterativo
    public void preOrdem(No raiz) {

        if (raiz == null) {
            return;
        }

        Stack<No> pilha = new Stack<>();

        pilha.push(raiz);

        while (!pilha.isEmpty()) {

            No atual = pilha.pop();

            System.out.print(atual.valor + " ");

            if (atual.direita != null) {
                pilha.push(atual.direita);
            }

            if (atual.esquerda != null) {
                pilha.push(atual.esquerda);
            }
        }
    }

    // 5. Percurso por nível
    public void porNivel(No raiz) {

        if (raiz == null) {
            return;
        }

        Queue<No> fila = new LinkedList<>();

        fila.add(raiz);

        while (!fila.isEmpty()) {

            No atual = fila.poll();

            System.out.print(atual.valor + " ");

            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }

            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }
    }

    // 6. Inserção recursiva
    public No inserir(No no, int valor) {

        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        }
        else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        }

        return no;
    }

    // 6. Busca recursiva
    public No buscar(No no, int valor) {

        if (no == null || no.valor == valor) {
            return no;
        }

        if (valor < no.valor) {
            return buscar(no.esquerda, valor);
        }

        return buscar(no.direita, valor);
    }

    // 7. Altura
    public int altura(No no) {

        if (no == null) {
            return -1;
        }

        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);

        return 1 + Math.max(esquerda, direita);
    }

}