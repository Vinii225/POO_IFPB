package ifpb.poo.pratica04.Q1versao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Temperatura temp1 = new Temperatura();
    
        System.out.println("Digite uma temperatura para ser convertida em Fahrenheit: ");
        temp1.temperatura = keyboard.nextDouble();

        System.out.println(temp1.temperatura);

        System.out.println(temp1);

        keyboard.close();
    }
}