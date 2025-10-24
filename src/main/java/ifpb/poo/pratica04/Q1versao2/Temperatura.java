package ifpb.poo.pratica04.Q1versao2;

public class Temperatura {

    private double temperatura;
    private char escala;
    private char escalaRequerida;


    // INFO: Getters
    public double getTemperatura() {
        return this.temperatura;
    }
    public char getEscala() {
        return this.escala;
    }
    public char getEscalaRequerida() {
        return this.escalaRequerida;
    }

    // INFO: Setters
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void setEscala(char escala) {
        this.escala = Character.toUpperCase(escala);
    }
    public void setEscalaRequerida(char escalaRequerida){
        this.escalaRequerida = Character.toUpperCase(escalaRequerida);
    } 

    public double ConverterTemperatura() {
        // INFO: Celsius para Farenheit ou Kelvin
        if (escala == 'C' && escalaRequerida == 'F') {
            return (temperatura * 9.0 / 5.0) + 32;
        } else if (escala == 'C' && escalaRequerida == 'K'){
                return temperatura + 273.15;

        // INFO: Fahrenheit para Celsius ou Kelvin
        } else if (escala == 'F' && escalaRequerida == 'C') {
            return (temperatura - 32.0) / 1.8;
        } else if (escala == 'F' && escalaRequerida == 'K') {
            return (temperatura - 32.0) * 5.0/9.0 + 273.15;

        // INFO: Kelvin para Celsius ou Fahrenheit
        } else if (escala == 'K' && escalaRequerida == 'C') {
            return temperatura - 273.15;
        } else if (escala == 'K' && escalaRequerida == 'F') {
            return (temperatura - 273.15) * 1.8 + 32;
        } else {
            return temperatura;
        }
    }

    public String toString() {
        return "A temperatura inserida foi de: " + temperatura + " " + escala
        + "\nA temperatura convertida é: " + String.format("%.2f", ConverterTemperatura()) + " " + escalaRequerida;
    }
}
