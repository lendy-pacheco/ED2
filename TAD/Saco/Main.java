package TAD.Saco;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO SACOVETOR ===");
        testarSaco(new SacoVetor<>());
        
        System.out.println("\n=== TESTANDO SACOLISTAENCADEADA ===");
        testarSaco(new SacoListaEncadeada<>());
    }
    
    public static void testarSaco(Saco<String> saco) {
        System.out.println("Inserindo elementos...");
        saco.inserir("Maçã");
        saco.inserir("Banana");
        saco.inserir("Laranja");
        saco.inserir("Maçã");
        
        System.out.println("Saco: " + saco);
        System.out.println("Tamanho: " + saco.tamanho());
        System.out.println("Está vazio? " + saco.vazio());
        
        System.out.print("Iterando: ");
        for (String item : saco) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        System.out.println("Contém 'Banana'? " + saco.contem("Banana"));
        System.out.println("Contém 'Uva'? " + saco.contem("Uva"));
        
        System.out.println("Removendo 'Banana': " + saco.remover("Banana"));
        System.out.println("Saco após remoção: " + saco);
        
        saco.limpar();
        System.out.println("Após limpar: " + saco);
        System.out.println("Está vazio? " + saco.vazio());
    }
}
