import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Digite um nome: ");
        nome = sc.nextLine();
        System.out.println("Digite uma idade: ");
        idade = Integer.parseInt(sc.nextLine());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
}