package model;

public class Caixa {
    private double saldo;

    public String depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return "Depósito efetuado com sucesso";
        }
        return "Valor inválido para o depósito";
    }

    public String sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return "Saque efetuado com sucesso";
        }
        return "Sem saldo para o saque";
    }

    public double getSaldo() {
        return saldo;
    }
}
