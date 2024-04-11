## Questão 2
Desenvolva uma classe chamada 'Cachorro' com os seguintes atributos não estáticos: nome (String), idade (int) e raça (String). 
Adicione um atributo estático chamado 'quantidadeCachorros' (int). 
Crie dois construtores para a classe: um que receba os valores de nome, idade e raça e outro que não receba parâmetros. 
O construtor sem parâmetros deve atribuir valores padrão aos atributos. 
Incrementar 'quantidadeCachorros' toda vez que um novo objeto 'Cachorro' for criado. 
Crie um método estático chamado 'getQuantidadeCachorros' que retorna a quantidade de objetos 'Cachorro' criados.
USE A FOLHA DE RESPOSTA

```
public class Cachorro{
    private String nome;
    private int idade;
    private String raca;
    private static int quantidadeDeCachorros = 0;

    public Cachorro(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        quantidadeDeCachorros++;
    }

    public Cachorro(){
        this.nome = "";
        this.idade = 0;
        this.raca = "";
        quantidadeDeCachorros++;
    }

    public int getQuantidadeDeCachorros(){
        return quantidadeDeCachorros;
    }
}
```

