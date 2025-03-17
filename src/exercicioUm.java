//definição da classe ReceitaDeBolo
class ReceitaDeBolo {
    // Atributos
    String sabor;
    int tempoDePreparo; // em minutos
    boolean assado;

    //metodo para preparar os ingredientes
    void preparar() {
        System.out.println("\nMisturando os ingredientes para um bolo de " + sabor);
    }

    //metodo para assar o bolo
    void assar() {
        assado = true;
        System.out.println("\nO bolo de " + sabor + " está assando por " + tempoDePreparo + " minutos.");
    }
}

public class exercicioUm {
    public static void main(String[] args) {
        //criando um objeto da classe ReceitaDeBolo
        ReceitaDeBolo meuBolo = new ReceitaDeBolo();

        //definindo os atributos do bolo
        meuBolo.sabor = "chocolate";
        meuBolo.tempoDePreparo = 45;
        meuBolo.assado = false;

        //chamando os métodos para executarem as ações
        meuBolo.preparar();
        meuBolo.assar();
    }
}
