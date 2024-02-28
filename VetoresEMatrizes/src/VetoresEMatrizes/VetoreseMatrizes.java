package VetoresEMatrizes;
import java.util.Scanner;

public class VetoreseMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = preencherVetor(scanner);
        exibirVetor(vetor);
        int soma = calcularSoma(vetor);
        System.out.println("O somatório dos números no vetor é: " + soma);

        System.out.print("Digite um número para verificar sua ocorrência no vetor: ");
        int numero = scanner.nextInt();
        int quantidade = contarNumero(vetor, numero);
        System.out.println("O número " + numero + " ocorre " + quantidade + " vezes no vetor.");
        
        int[][] matrizA = preencherMatriz(scanner, "A");
        System.out.print("Digite o valor Buscado ");
        int numeroProcura = scanner.nextInt();
        boolean quantidadeMatriz = buscaNumeroMatriz(matrizA,numeroProcura);
        System.out.print(quantidadeMatriz);
        int[][] matrizB = preencherMatriz(scanner, "B");
        int[][] matrizSoma = somarMatrizes(matrizA, matrizB);
        exibirMatriz(matrizSoma);

        scanner.close();
    }

    public static int[] preencherVetor(Scanner scanner) {
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("Vetor informado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return soma;
    }

    public static int contarNumero(int[] vetor, int numero) {
        int quantidade = 0;
        for (int num : vetor) {
            if (num == numero) {
                quantidade++;
            }
        }
        return quantidade;
    }
    

    public static boolean buscaNumeroMatriz(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[][] preencherMatriz(Scanner scanner, String nomeMatriz) {
        int[][] matriz = new int[3][3];
        System.out.println("Preencha a matriz " + nomeMatriz + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizSoma = new int[3][3];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizSoma;
    }
}
