public class Conta {
    //1. Atributos
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    //2. metodos
    public boolean sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);
    }
}
