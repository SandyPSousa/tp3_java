package exercicioTres;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Sandy Sousa", 12345, "001", 100.00, "14/03/2025");

        System.out.println("### Informações Iniciais ###");
        conta1.exibirInformacoes();

        conta1.deposita(500);
        System.out.println("\nApós depósito de R$ 500:");
        conta1.exibirInformacoes();

        conta1.saca(300);
        System.out.println("\nApós saque de R$ 300:");
        conta1.exibirInformacoes();

        double rendimento = conta1.calculaRendimento();
        System.out.printf("\nRendimento mensal estimado: R$ %.2f\n", rendimento);
    }
}
