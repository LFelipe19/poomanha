public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "hp";
        computador1.preco = 500;
        computador1.cor = "prata";
        computador1.modelo = "XS";
        computador1.numeroSerie = 12345;
        System.out.println(computador1);
        computador1.calcularValor();
        System.out.println();
        System.out.println(computador1);

        Computador computador2 = new Computador();
        computador2.marca = "ibm";
        computador2.modelo = "lenovo";
        computador2.cor = "branca";
        computador2.numeroSerie = 234;
        computador2.preco = 1000;
        System.out.println();
        System.out.println(computador2);
        computador2.calcularValor();
        System.out.println();
        System.out.println(computador2);
        boolean deuCerto;
        deuCerto = computador2.alterarValor(3000);
        if(deuCerto){
            System.out.println("Valor alterado com sucesso");
        }else{
            System.out.println("Valor nao alterado");
        }
        System.out.println(computador2);;
    }
}