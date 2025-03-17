package exercicioTres;

class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public void exibirInformacoes() {
        System.out.println("\nTitular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }
}
