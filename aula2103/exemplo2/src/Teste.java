public class Teste {
    public static void main(String[] args) {
        Meses mesVencimento = Meses.fevereiro;
        System.out.println("Meses do Ano");

        for(Meses mes : Meses.values()){
            System.out.println(mes);
        }
    }
}
