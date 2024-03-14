public class Funcionario {
    private String departamento;
    private double salario;
    private String rg;
    private String nome;
    private boolean ativo;
    public Funcionario(){
        //Construtor padrao
    }

    public Funcionario(String nome, String departamento,
                       String rg, double salario) {
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.nome = nome;
        this.ativo =true;
    }

    public void bonificar(double valor){
        salario += valor;
    }
    public void listar(){
        System.out.println("Dados do Funcionário");
        System.out.println("nome = " + nome);
        System.out.println("rg = " + rg);
        System.out.println("departamento = " + departamento);
        String texto = ativo ? "Ativo" : "Inativo";
        System.out.println("Situação do funcionário: " + texto);
        System.out.println("salario = " + salario);
    }

    public String getRg(){
        return rg;
    }
}
