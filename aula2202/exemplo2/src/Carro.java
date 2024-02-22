public class Carro {
    //1. Definir atributos
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public int velocidadeAtual;
    public static double ta = 9.99;

    //2. definir os métodos
    public void acelerar(int velocidade){
        velocidadeAtual += velocidade;
    }
    public void frear(int velocidade){
        velocidadeAtual -= velocidade;
    }
    public void exibirDados(){
        System.out.println("Dados do Carro: ");
        System.out.println("modelo = " + modelo);
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("ano = " + ano);
        System.out.println("ta = " + ta);
        System.out.println("velocidadeAtual = " + velocidadeAtual);
        System.out.println("==================================\n");
    }
}
