import java.util.scanner;
public scanner input = new scanner(system.in);
final int TAM = 30;
public class ex {
    public static void main(String[] args) {
        int vetor1[] = new int[TAM];
        int vetor2[] = new int[TAM];
        criaVetor(vetor1);
        criaVetor(vetor2);

        do{
            System.out.println("escolha uma opcao:");
            System.out.println("1 - inserir 1 elemento no conjunto A");
            System.out.println("2 - inserir 1 elemento no conjunto B");
            System.out.println("3 - imprimir os elementos do conjunto A e B");
            System.out.println("4 - imprimir a interseção dos conjuntos A e B");
            System.out.println("5 - imprimir a diferença dos conjuntos A e B");
            System.out.println("6 - imprimir a diferença dos conjuntos B e A");
            System.out.println("0 - sair");
            int opcao = input.nextInt();
            switch(opcao){
                case 1:inserirElemento(vetor1, TAM);
                break;
                case 2:{inserirElemento(vetor2, TAM);
                        inserirElemento(vetor2, TAM);}
                break;
                case 3:{imprimirVetor(vetor1, TAM);
                        imprimirVetor(vetor2, TAM);}
                break;
                case 4:intersecao(vetor1, vetor2, TAM);
                break;
                case 5:diferençaAB(vetor1, vetor2, TAM);
                break;
                case 6:diferençaBA(vetor1, vetor2, TAM);
                break;
                case 0:System.out.println("saindo...");
                break;
                default:System.out.println("opcao invalida");
            }
        }while(opcao != 0);

    }
    }
    public class void criaVetor(int vetor[]){
        for(int i = 0; i < TAM; i++){
            vetor[i] = 0;
        }
    }
    public class void inserirElemento(int v[], int tam){
        System.out.println("informe um valor:");
        int valor = input.nextInt();
        int pos = buscaSequencial(v, tam, 0);
        if(pos != -1){
            v[pos] = valor;
            System.out.println("valor inserido com sucesso");
            System.out.println("tamanho atual do vetor: " + (pos + 1));
        }else{
            System.out.println("vetor cheio");

    }

    public class int buscaSequencial(int v[], int tam, int valor){
        for(int i = 0; i < tam; i++){
            if(v[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public class void imprimirVetor(int v[], int tam){
        for(int i = 0; i < tam; i++){
            if(v[i] != 0){
                System.out.println(v[i] + " ");
            }
        }
        System.out.println();
    }
    public class void intersecao(int v1[], int v2[], int tam){
        System.out.println("interseção dos conjuntos A e B:");
        for(int i = 0; i < tam; i++){
            if(v1[i] != 0){
                if(buscaSequencial(v2, tam, v1[i]) != -1){
                    System.out.println(v1[i] + " ");
                }
            }
        }
        System.out.println();
    }
    public class void diferençaAB(int v1[], int v2[], int tam){
        System.out.println("diferença dos conjuntos A e B:");
        for(int i = 0; i < tam; i++){
            if(v1[i] != 0){
                if(buscaSequencial(v2, tam, v1[i]) == -1){
                    System.out.println(v1[i] + " ");
                }
            }
        }
        System.out.println();
    }
    public class void diferençaBA(int v1[], int v2[], int tam){
        System.out.println("diferença dos conjuntos B e A:");
        for(int i = 0; i < tam; i++){
            if(v2[i] != 0){
                if(buscaSequencial(v1, tam, v2[i]) == -1){
                    System.out.println(v2[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
