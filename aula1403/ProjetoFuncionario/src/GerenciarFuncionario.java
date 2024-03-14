import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    private List<Funcionario>listaFuncionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarFuncionario gerenciar = new GerenciarFuncionario();

        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Bonificar Funcionário");
            System.out.println("3. Consultar Todos os Funcionários");
            System.out.println("4. Consultar Funcionário");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execBonificar();
                    break;
                case 3:
                    gerenciar.execConsultarTodos();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }
        }while(opcao!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();
        System.out.println("Digite o departamento do funcionário:");
        String departamento = sc.nextLine();
        System.out.println("Digite o rg do funcionário:");
        String rg = sc.nextLine();
        System.out.println("Digite o salário do funcionário:");
        double salario = Double.parseDouble(sc.nextLine());
        Funcionario func = new Funcionario(nome, departamento, rg, salario);
        listaFuncionarios.add(func); //adicionando na lista de funcionario
        System.out.println("Cadastrado com sucesso...");
    }

    public void execBonificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do Funcionário a ser bonificado: ");
        String rgProc = sc.nextLine();
        //varrer a lista de funcionários
        for(Funcionario f : listaFuncionarios){
            if(f.getRg().equals(rgProc)){
                System.out.println("Digite o valor da bonificação");
                double bonificacao = Double.parseDouble(sc.nextLine());
                f.bonificar(bonificacao);
                System.out.println("Funcionário bonificado com sucesso");
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }

    public void execConsultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do Funcionário a ser exibido: ");
        String rgProc = sc.nextLine();
        //varrer a lista de funcionários
        for(Funcionario f : listaFuncionarios){
            if(f.getRg().equals(rgProc)){
                f.listar();
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }

    public void execConsultarTodos(){
        //varrer a lista de funcionários
        for(Funcionario f : listaFuncionarios){
            f.listar();
        }
    }

}