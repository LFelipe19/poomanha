import java.util.Objects;

public class Computador {
    //1. Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //2. Métodos


    @Override
    public String toString() {
        return "Dados do computador:\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Cor: " + cor + "\n" +
                "Preco: " + preco + "\n" +
                "Número de Série: " + numeroSerie + "\n";
    }

    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }

    }

    public boolean alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return true;
        }
        return false;
    }

}
