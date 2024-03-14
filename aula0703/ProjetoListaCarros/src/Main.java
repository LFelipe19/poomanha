import java.util.Date;



public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.nome = "Joaquim 1";
        cliente.endereco = "Rua dos bobos, 0";
        cliente.telefone = "(11) 99999-9999";


        cliente2.nome = "Joaquim 2";
        cliente2.endereco = "Rua dos bobos 2, 0";
        cliente2.telefone = "(11) 999991-9999";
        carro.setModelo("F");
        carro.setCor("Vermelho");
        carro.setAno(2022);
        carro.setValor(50000.00);
        carro2.setModelo("Ford Ka");
        carro2.setCor("Preto");
        carro2.setAno(2021);
        carro2.setValor(30000.00);
        carro3.setModelo("Gol");
        carro3.setCor("Vermelho");
        carro3.setAno(2020);
        carro3.setValor(20000.00);

        cliente.carros.add(carro);
        cliente.carros.add(carro2);

        cliente2.carros.add(carro3);



        cliente.exibirInformacoes();
        cliente2.exibirInformacoes();

    }
}