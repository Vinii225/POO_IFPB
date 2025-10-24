package ifpb.poo.pratica04.Q3versao1;

import java.util.Scanner;
import java.util.Locale;

import ifpb.poo.pratica04.Q3versao1.Entitties.Computador;

public class Main {
    public static void main(String[] args) { 
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        int[] ip = {192, 168, 10, 15};
        int[] mask = {255, 255, 255, 0};

        Computador comp1 = new Computador(ip, mask);

        System.out.println(comp1);

        keyboard.close();
    }
}
