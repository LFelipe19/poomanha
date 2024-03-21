import model.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3;
        //Primeiro (ainda nao sei os dados dele)
        aluno1 = new Aluno();

        //Segundo (login e a senha dele)
        aluno2 = new Aluno("maromo", "123");

        //Terceiro (com todos os dados)
        aluno3 = new Aluno(1, "Antonio",
                "aluAntonio", "456", "ADS");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        
    }
}
