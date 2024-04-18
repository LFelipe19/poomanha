package model;

public class Poupanca extends Conta{
    private int diaAninversario;

    public Poupanca(int numero, String nomeCliente, int diaAninversario) {
        super(numero, nomeCliente);
        this.diaAninversario = diaAninversario;
    }

    public int getDiaAninversario() {
        return diaAninversario;
    }

    public void setDiaAninversario(int diaAninversario) {
        this.diaAninversario = diaAninversario;
    }

    @Override
    public String toString() {
        final StringBuilder sb= new StringBuilder();
        sb.append(super.toString());
        sb.append("dia de Aniversario=").append(diaAninversario).append("\n");
        return sb.toString();
    }
}
