package ifpb.poo.pratica04.Q1versao3;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        double temperatura;
        String escala;
        String escalaRequerida;

        Temperatura temp1 = new Temperatura();
    
        System.out.println("===== Programa Conversor de Temperatura =====");
        System.out.println("Digite uma temperatura para ser convertida: ");
        temperatura = keyboard.nextDouble();
        temp1.setTemperatura(temperatura);

        System.out.println("Digite a escala da temperatura: ");
        escala = keyboard.next();
        temp1.setEscala(escala);

        System.out.println("Digite a escala da temperatura que quer converter: ");
        escalaRequerida = keyboard.next();
        temp1.setEscalaRequerida(escalaRequerida);

        System.out.println("Dados: " + temp1.getTemperatura() + " " + temp1.getEscala() + ", conversão para: " + temp1.getEscalaRequerida());

        System.out.println(temp1);
        
        keyboard.close();
    }
}