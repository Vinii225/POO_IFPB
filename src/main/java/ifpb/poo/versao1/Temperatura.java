package ifpb.poo.versao1;

public class Temperatura {

    double temperatura;

    public double toFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }

    public String toString() {
        return "A temperatura convertida para fahrenheit é de: " + toFahrenheit();
    }
}
