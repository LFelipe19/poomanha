import java.util.Scanner;

public class ContaTeste {
    //1. atributos
    public Conta cc = new Conta();

    //2. métodos
    public static void main(String[] args) {
        ContaTeste contaTeste = new ContaTeste();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    contaTeste.execCadastrar();
                    break;
                case 2:
                    contaTeste.execDepositar();
                    break;
                case 3:
                    contaTeste.execSacar();
                    break;
                case 4:
                    contaTeste.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }

    public void execCadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta:");
        cc.conta = scanner.nextLine();
        System.out.println("Digite a agência da conta:");
        cc.agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        cc.nomeCliente = scanner.nextLine();
        System.out.println("Cadastro efetuado com sucesso");
    }

    public void execConsultar(){
        System.out.println("Dados da conta: ");

        cc.imprimir();
    }

    public void execSacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(scanner.nextLine());
        boolean sacou = cc.sacar(valorSaque);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente para o saque");
        }
    }

    public void execDepositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = Double.parseDouble(scanner.nextLine());
        boolean depositou = cc.depositar(valorDeposito);
        if(depositou) {
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor indevido para o deposito");
        }
    }
}