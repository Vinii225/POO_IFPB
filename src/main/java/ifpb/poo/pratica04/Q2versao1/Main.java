package ifpb.poo.pratica04.Q2versao1;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo(5.0, 3.0);
        System.out.println("=== Medidas ===");
        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());

        
        System.out.println("Area: " +r1.doArea());
        System.out.println("Perimetro: " + r1.doPerimeter());

        System.out.println("\n");
        System.out.println(r1);

        // INFO: enviando ao objeto novos valores com set
        r1.setBase(12.5);
        r1.setAltura(5.0);

        System.out.println("\n");
        System.out.println("=== Medidas ===");
        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());
        
        System.out.println("Area: " +r1.doArea());
        System.out.println("Perimetro: " + r1.doPerimeter());
        
        System.out.println("\n");
        System.out.println(r1);

        // INFO: enviando ao objeto valores iguais com set
        r1.setBase(10.0);
        r1.setAltura(10.0);

        System.out.println("\n");
        System.out.println("=== Medidas ===");
        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());
        
        System.out.println("Area: " +r1.doArea());
        System.out.println("Perimetro: " + r1.doPerimeter());
        
        System.out.println("\n");
        System.out.println(r1);

        keyboard.close();
    }
}