package exercicioQuatro;

public class TestarFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        System.out.printf("Área do Círculo (raio 3.0): %.2f\n", circulo.calcularArea());
        System.out.printf("Volume da Esfera (raio 5.0): %.2f\n", esfera.calcularVolume());
    }
}
