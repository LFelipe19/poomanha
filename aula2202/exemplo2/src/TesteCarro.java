public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.modelo = "KA";
        carro1.marca = "Ford";
        carro1.ano = 2010;
        carro1.velocidadeAtual = 60;
        carro1.cor = "Prata";

        carro1.exibirDados();
        Carro.ta = 11.10;
        carro1.acelerar(30);
        carro1.exibirDados();
    }
}