public class Main{
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.raiz = arvore.inserir(arvore.raiz, 10);
        arvore.raiz = arvore.inserir(arvore.raiz, 5);
        arvore.raiz = arvore.inserir(arvore.raiz, 20);
        arvore.raiz = arvore.inserir(arvore.raiz, 2);
        arvore.raiz = arvore.inserir(arvore.raiz, 7);

        System.out.println("Número de nós: "
                + arvore.contarNos(arvore.raiz));

        System.out.println("Número de folhas: "
                + arvore.contarFolhas(arvore.raiz));

        System.out.println("Número de nós internos: "
                + arvore.contarNosInternos(arvore.raiz));

        System.out.print("Pré-ordem: ");
        arvore.preOrdem(arvore.raiz);

        System.out.println();

        System.out.print("Por nível: ");
        arvore.porNivel(arvore.raiz);

        System.out.println();

        System.out.println("Altura: "
                + arvore.altura(arvore.raiz));

        No resultado = arvore.buscar(arvore.raiz, 7);

        if (resultado != null) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Valor não encontrado!");
        }
    }
}