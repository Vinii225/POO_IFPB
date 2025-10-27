package ifpb.poo.pratica05.Q1;

public class Semaforo {
    private int x;
    private String comando;

    public Semaforo(int x, String comando) {
        this.x=x;
        this.comando=comando;
    }

    // INFO: Setter
    public void setX(int x) {
        this.x = x;
    }
    public void setComando(String comando) {
        this.comando = comando;
    }
    // INFO: Getter
    public int getX() {
        return x;
    }
    public String getComando() {
        return comando;
    }

    // Info: Incrementar X
    public void icrementoX() {
        setX(getX()+1);
    }

    // INFO: Reset de X para 0
    public void resetX() {
        setX(0);
    }

    public void exibirSemaforo() {
        while (String getComando != 'X') {
            
        }
    }

    // INFO: metódo aumentar valor = mudar cor
    public void mudarCor() {
        icrementoX();
        if (x == 1 ) {
            System.out.println("\033[31mTexto Vermelho\033[0m");
        } else if (x == 2) {
            System.out.println("\033[32mTexto Verde\033[0m");
        } else if (x == 3) {
            System.out.println("\033[33mTexto Amarelo\033[0m");
        } else if (x == 4) {
            resetX();
        }
    }
}
