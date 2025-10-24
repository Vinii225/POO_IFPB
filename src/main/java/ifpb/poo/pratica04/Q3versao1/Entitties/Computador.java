package ifpb.poo.pratica04.Q3versao1.Entitties;

public class Computador {
    private int[] arrayIP;
    private int[] arrayMascara;
    private int[] arrayRede;

    public Computador(int[] arrayIP, int[] arrayMascara) {
        this.arrayIP = arrayIP;
        this.arrayMascara = arrayMascara;
        this.arrayRede = new int [4]; 
    }

    // INFO: Setters
    public void setArrayIP(int[] arrayIP) {
        this.arrayIP = arrayIP;
    }
    public void setArrayMascara(int[] arrayMascara) {
        this.arrayMascara = arrayMascara;
    }
    public void setArrayRede(int[] arrayRede) {
        this.arrayRede = fazerRede();
    }

    // INFO: Getters
    public int[] getArrayIP() {
        return arrayIP;
    }
    public int[] getArrayMascara() {
        return arrayMascara;
    }
    public int[] getArrayRede() {
        return arrayRede;
    }

    // INFO: Método para ter a rede
    private int [] fazerRede() {
        for (int i = 0; i < 4; i++) { 
            this.arrayRede[i] = getArrayIP()[i] & getArrayMascara()[i]; 
        }
        return getArrayRede();
    }
    
    public String toString() {
        fazerRede();
        return  "IP: " + getArrayIP()[0] + "." + getArrayIP()[1] + "." + getArrayIP()[2] + "." + getArrayIP()[3] +
        "\nMáscara: " + getArrayMascara()[0] + "." + getArrayMascara()[1] + "." + getArrayMascara()[2] + "." + getArrayMascara()[3] +
        "\nEndereço de rede: " + getArrayRede()[0] + "." + getArrayRede()[1] + "." + getArrayRede()[2] + "." + getArrayRede()[3];
    }
}
