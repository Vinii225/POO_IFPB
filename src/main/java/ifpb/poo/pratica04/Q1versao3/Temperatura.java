package ifpb.poo.pratica04.Q1versao3;

public class Temperatura {

    private double temperatura;
    private String escala;
    private String escalaRequerida;


    // INFO: Getters
    public double getTemperatura() {
        return this.temperatura;
    }
    public String getEscala() {
        return this.escala;
    }
    public String getEscalaRequerida() {
        return this.escalaRequerida;
    }

    // INFO: Setters
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void setEscala(String escala) {
        this.escala = escala;
    }
    public void setEscalaRequerida(String escalaRequerida){
        this.escalaRequerida = escalaRequerida;
    } 

    public double converterTemperatura() {
        // INFO: Celsius para Farenheit ou Kelvin
        if (charEscala() == 'C' && charEscalaRequerida() == 'F') {
            return (temperatura * 9.0 / 5.0) + 32;
        } else if (charEscala() == 'C' && charEscalaRequerida() == 'K'){
                return temperatura + 273.15;

        // INFO: Fahrenheit para Celsius ou Kelvin
        } else if (charEscala() == 'F' && charEscalaRequerida() == 'C') {
            return paraCelsius() / 1.8;
        } else if (charEscala() == 'F' && charEscalaRequerida() =='K') {
            return paraCelsius()* 5.0/9.0 + 273.15;

        // INFO: Kelvin para Celsius ou Fahrenheit
        } else if (charEscala() == 'K' && charEscalaRequerida() == 'C') {
            return paraCelsius();
        } else if (charEscala() == 'K' && charEscalaRequerida() == 'F') {
            return paraCelsius() * 1.8 + 32;
        } else {
            return temperatura;
        }
    }

    // INFO: Conversão para Celsius, simplificação para inserir dentro de converterTemperatura
    private double paraCelsius() {
        if (charEscala() == 'K') {
            return temperatura - 273.15;
        } else if (charEscala() == 'F') {
            return temperatura - 32.0;
        } else {
            return temperatura;
        }
    }

    private char charEscala () {
        return Character.toUpperCase(getEscala().charAt(0));
    }
    private char charEscalaRequerida () {
        return Character.toUpperCase(getEscalaRequerida().charAt(0));
    }

    public String toString() {
        return "A temperatura inserida foi de: " + temperatura + " " + charEscala()
        + "\nA temperatura convertida é: " + String.format("%.2f", converterTemperatura()) + " " + charEscalaRequerida();
    }
}
