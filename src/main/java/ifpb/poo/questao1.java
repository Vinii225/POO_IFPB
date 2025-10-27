package ifpb.poo;

public class questao1 {
    public static void main(String[] args) {
        double[] amostra = {11.0, 10.0, 14.0, 10.0, 17.0, 15.0, 19.0, 13.0, 14.0, 16.0,
                17.0, 10.0, 12.0, 15.0, 11.0, 13.0, 14.0, 15.0, 17.0, 16.0, 18.0};

        double soma = 0.0;
        for (double v : amostra) {
            soma += v;
        }
        double media = soma / amostra.length;

        double acumulador = 0.0;
        for (double v : amostra) {
            double diff = v - media;
            acumulador += Math.pow(diff, 2);
        }

        double varianciaAmostral = acumulador / (amostra.length - 1);

        System.out.println("Média: " + media);
        System.out.printf("Variância (amostral): " + varianciaAmostral);
        System.out.println("\n" + Math.sqrt(varianciaAmostral));
    }
}
