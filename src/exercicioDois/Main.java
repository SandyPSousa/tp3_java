package exercicioDois;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 30.99, 50);
        produto1.exibirInformacoes();

        System.out.print("Produto 1 após alterações:");
        System.out.print("\n");
        produto1.alterarPreco(29.49);
        produto1.alterarQuantidade(30);

        produto1.exibirInformacoes();

        produto1.setNome("açúcar");
        produto1.exibirInformacoes();
        Produto produto2 = new Produto("Feijão", 12.50, 20);
        produto2.exibirInformacoes();
    }
}
