import java.util.Scanner;
public class ex {
    static Scanner input = new Scanner(System.in);
    static final int TAM = 30;
    public static void main(String[] args) {
        int vetor1[] = new int[TAM];
        int vetor2[] = new int[TAM];
        int tam1 = 0, tam2 = 0;
        int opcao;
        do{
            System.out.println("escolha uma opcao:");
            System.out.println("1 - inserir 1 elemento no conjunto A");
            System.out.println("2 - inserir 1 elemento no conjunto B");
            System.out.println("3 - imprimir os elementos do conjunto A e B");
            System.out.println("4 - imprimir a interseção dos conjuntos A e B");
            System.out.println("5 - imprimir a diferença dos conjuntos A e B");
            System.out.println("6 - imprimir a diferença dos conjuntos B e A");
            System.out.println("0 - sair");
            opcao = input.nextInt();
            switch(opcao){
                case 1:tam1= inserirElemento(vetor1, tam1);
                break;
                case 2:{tam2 = inserirElemento(vetor2, tam2);}
                        
                break;
                case 3:{imprimirVetor(vetor1, tam1);
                        imprimirVetor(vetor2, tam2);}
                break;
                case 4:intersecao(vetor1,tam1, vetor2, tam2);
                break;
                case 5:diferenca(vetor1, tam1, vetor2, tam2, "A-B");
                break;
                case 6:diferenca(vetor2, tam2, vetor1, tam1, "B-A");
                break;
                case 0:System.out.println("saindo...");
                break;
                default:System.out.println("opcao invalida");
            }
        }while(opcao != 0);
    }
    

    public static int inserirElemento(int v[], int tam){
        int valor;
        System.out.println("informe o valor a ser inserido:");
        valor = input.nextInt();
        int pos = buscaSequencial(v, tam, valor);
        if(pos == -1){
            v[tam] = valor;
            System.out.println("valor inserido com sucesso");
            return tam + 1;
        }else
        if (tam >= v.length){
            System.out.println("conjunto cheio, nao e possivel inserir novos elementos");
            return tam;}
            {
            System.out.println("valor ja existe no conjunto");
            return tam;
        }
        
    }

    public static int buscaSequencial(int v[], int tam, int valor){
        for(int i = 0; i < tam; i++){
            if(v[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public static void imprimirVetor(int v[], int tam){
        if (tam == 0) {
            System.out.println("[vazio]");
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i < tam; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("]");
    }
    
    public static void intersecao(int v1[], int tam1, int v2[], int tam2) {
        System.out.print("Interseção (A ∩ B): [ ");
        boolean encontrou = false;
        for (int i = 0; i < tam1; i++) {
            if (buscaSequencial(v2, tam2, v1[i]) != -1) {
                System.out.print(v1[i] + " ");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.print("vazio");
        }
        System.out.println("]");
    }

    public static void diferenca(int v1[], int tam1, int v2[], int tam2, String titulo) {
       if (tam1==tam2) {
        int [] v3 = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            v3[i] = v1[i] - v2[i];
        }
        System.out.println(titulo + ": ");
        imprimirVetor(v3, tam1);
       }
    }
}
