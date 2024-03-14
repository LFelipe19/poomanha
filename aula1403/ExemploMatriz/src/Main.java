import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        //mostrando os valores
        for (int[] vetor: matriz) {
            for (int y: vetor) {
                System.out.printf("[%2d] ", y);
            }
            System.out.println();
        }

    }
}