package ifpb.poo.pratica04.Q2versao1;

public class Retangulo {
    private double base, altura;
    
    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // INFO: Setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // INFO: Getters
    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }

    // INFO: Métodos
    public double doArea() {
        if (eQuadrado()) {
            return 0.0;
        } else {
            return getAltura() * getBase();
        }
    }
    public double doPerimeter() {
        return getAltura()*2 + getBase()*2;
    }

    // INFO: Método identificador Quadrado
    public boolean eQuadrado() {
        if (getAltura()==getBase()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (eQuadrado()) {
            return "O objeto é um quadrado, logo os cálculos não são mostrados...";
        } else {
        return "O retângulo possui uma base de " + base + " e altura de " + altura
        + "\nArea: " + doArea() 
        + "\nPerimetro: " + doPerimeter(); 
        }
    }
}
