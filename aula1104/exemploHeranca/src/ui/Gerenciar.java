package ui;

import model.Conta;
import model.ContaCorrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    //lista de contas
    List<Conta> listaContas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Gerenciar gerenciar = new Gerenciar();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Consultar Conta");
            System.out.println("3. Excluir Conta");
            System.out.println("4. Listar Todas as Contas");
            System.out.println("5. Exibir Saldo");
            System.out.println("6. Total Acumulado das Contas");
            System.out.println("9. Finalizar");
            opcao = Integer.parseInt(gerenciar.sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execConsultar();
                    break;
                case 3:
                    gerenciar.execExcluir();
                    break;
                case 4:
                    gerenciar.execListar();
                    break;
                case 5:
                    gerenciar.execExibirSaldo();
                    break;
                case 6:
                    gerenciar.execTotalizar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao !=9);
    }

    private void execTotalizar() {
    }

    private void execExibirSaldo() {
    }

    private void execListar() {
    }

    private void execExcluir() {
    }

    private void execConsultar() {
        int numero;
        System.out.println("Digite o numero da conta a consultar");
        numero = Integer.parseInt(sc.nextLine());
        for(Conta conta : listaContas){
            if(conta.getNumero()==numero){
                System.out.println(conta);
                return;
            }
        }
        System.out.println("Não encontrei conta com este numero");
    }

    private void execCadastrar() {
        int tipo;
        double limite;
        String nome;
        int diaAniversario;
        int numeroConta;
        boolean temLimite;
        System.out.println("Digite 1 para Corrente, 2 para poupança: ");
        tipo = Integer.parseInt(sc.nextLine());
        if(tipo <1 || tipo >2){
            System.out.println("Tipo inválido. Verifique");
            return;
        }
        System.out.println("Digite o numero da conta..:");
        numeroConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente..: ");
        nome = sc.nextLine();
        if(tipo==1){
            System.out.println("Digite o valor do limite: ");
            limite = Double.parseDouble(sc.nextLine());
            temLimite = limite > 0;
            ContaCorrente conta = new ContaCorrente(numeroConta,
                    nome, temLimite, limite);
            System.out.println("Conta corrente cadastrada");
            listaContas.add(conta);
        }else{
            System.out.println("Digite o dia de aniversario da conta: ");
            diaAniversario = Integer.parseInt(sc.nextLine());
            Poupanca poupanca = new Poupanca(numeroConta,
                    nome, diaAniversario);
            System.out.println("Poupança cadastrada com sucesso");
            listaContas.add(poupanca);
        }
    }
}
