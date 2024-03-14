public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.length()<2){
            throw new IllegalArgumentException(
                    "Modelo deve ter pelo menos 2 caracteres");
        }
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirInformacoes() {
        System.out.println("Informações do carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
    }
}
