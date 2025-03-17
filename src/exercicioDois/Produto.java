package exercicioDois;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

public Produto(String nome, double preco, int quantidadeEmEstoque) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;

}
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

public void alterarPreco(double novoPreco) {
    this.preco = novoPreco;
    System.out.println("Preço atualizado para R$ " + preco);
}

public void alterarQuantidade(int novaQuantidade){
    this.quantidadeEmEstoque = novaQuantidade;
    System.out.println("Quantidade em estoque atualizada para " + quantidadeEmEstoque);
}

public void exibirInformacoes() {
    System.out.println("\n### Informações do Produto ###");
    System.out.println("Nome: " + nome);
    System.out.println("Preço: R$ " + preco);
    System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
}


}
