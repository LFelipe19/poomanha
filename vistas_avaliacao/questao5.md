## Questao 5
Questão 5: ProgramaGerenciarLoja [5 pontos no total]
Você foi contratado para desenvolver um sistema de gerenciamento de estoque para uma loja. O sistema deve ser capaz de realizar o cadastro de produtos, a alteração de informações de produtos cadastrados, comprar itens (incrementar estoque), vender itens (decrementar estoque), mostrar a lista de produtos disponíveis e exibir o estoque atual de um produto específico. Este sistema deve ser implementado em Java e utilizar um ArrayList<Produto> para armazenar os produtos.

Atividades:
Classe Produto:
a)	Crie uma classe chamada Produto que tenha como atributos id (tipo int), nome (tipo String), preco (tipo double) e quantidadeEmEstoque (tipo int). Esses atributos devem ser privados. [1 pontos]
b)	Implemente um construtor para a classe Produto que inicialize todos os atributos.[1 ponto]
c)	Forneça métodos get e set para cada atributo. [1 ponto]

Classe GerenciarProduto:
Crie uma classe chamada GerenciarProduto. Esta classe será responsável pela lógica de negócio do seu sistema de gerenciamento de estoque.
d)	Dentro da classe GerenciarProduto, declare uma variável listaProdutos do tipo ArrayList<Produto>. [1 ponto]
e)	Crie um método comprarItem() nesta classe que deve permitir ao usuário que aumente a quantidade em estoque de um produto específico. [1 item] 
Não é necessário as demais modelagens e códigos, só os fragmentos solicitados. Numere, por favor. Ex: Questão 5a), 5b)...

5a) e 5b)Construtor e 5c) get/set
```
public class Produto{
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Produto(int id, String nome, double preco, int quantidadeEmEstoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

}
```

5d) 
```
public class GerenciarProduto{
    List<Produto>listaProdutos = new ArrayList<>();

    public void comprarItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto a comprar: ");
        int codigo = Integer.parseInt(sc.nextLine());
        for(Produto produto : listaProdutos){
            if(codigo == produto.getId()){
                System.out.println("Digite a quantidade comprada: ");
                int qtd = Integer.parseInt(sc.nextLine());
                produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque + qtd);
                System.out.println("Quantidade de compra atualizada");
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }
}
```