package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 0;
            int operando = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de x: \n");
            x = Integer.parseInt(sc.nextLine());
            System.out.println("Informe o valor do segundo operando: \n");
            operando = sc.nextInt();
            int resultado = x / operando;
            System.out.println("Resultado: " + resultado);
        }catch (InputMismatchException | NumberFormatException ex){
            System.out.println("Valor deve ser inteiro");
        }catch (ArithmeticException ex){
            System.out.println("Impossível dividir por zero");
        }finally {
            System.out.println("Independe de erro. Voce viu essa mensagem");
        }

    }
}