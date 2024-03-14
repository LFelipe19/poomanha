import java.util.Scanner;

public class Main {
    /*
        Comentário de mais de uma linha:
        Abaixo a função main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        boolean produtividade;
        double salarioReajustado;
        System.out.println("Digite o salario: ");
        // Na linha abaixo, convertemos um String para Double
        salario = Double.parseDouble(sc.nextLine());
        System.out.println("Digite 1 para produtividade, 0 para o contrário: ");
        int resposta = Integer.parseInt(sc.nextLine());
        produtividade = resposta == 1;
        salarioReajustado = produtividade ? salario * 1.1 : salario * 1.05;
        System.out.println("Salário novo Calculado: " + salarioReajustado);
        int resultado = somar(12, 34);
    }

    /**
     * @since fev 2024
     * A Função somar retorna a soma de dois valores inteiros passados
     * como parâmetros
     * @param x primeiro parâmetro em inteiro
     * @param y segundo parâmetro em inteiro
     * @return resultado da operação de soma
     */
    public static int somar(int x, int y){
        return x + y;
    }
}