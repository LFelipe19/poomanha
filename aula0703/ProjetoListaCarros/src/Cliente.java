import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    public String nome;
    public String endereco;
    public String telefone;
    public Date dataNascimento;

    public List<Carro> carros =new ArrayList<>();

    public void exibirInformacoes() {
        System.out.println("Informações do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de nascimento: " + dataNascimento);
        if(carros.size()>0){
            System.out.println("Carros:");
            for(Carro c: carros){
                c.exibirInformacoes();
            }
        }
        System.out.println();
    }
}
