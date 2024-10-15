public class Lampada {
    private boolean estado;
    private int corVermelho;
    private int corVerde;
    private int corAzul;
    private int brilho;

    public Lampada() {
        this.estado = false;
        this.corVermelho = 255;
        this.corVerde = 255;
        this.corAzul = 255;
        this.brilho = 255;
    }

    // Método para acender a lâmpada
    public void acender() {
        this.estado = true;
    }

    // Método para desligar a lâmpada
    public void desligar() {
        this.estado = false;
    }

    // Método para verificar se a lâmpada está acesa
    public boolean isAcesa() {
        return this.estado;
    }

    // Método para definir a cor da lâmpada (RGB)
    public void setCor(int vermelho, int verde, int azul) {
        if (vermelho < 0 || vermelho > 255 || verde < 0 || verde > 255 || azul < 0 || azul > 255) {
            throw new IllegalArgumentException("Os valores da cor devem estar entre 0 e 255.");
        }
        this.corVermelho = vermelho;
        this.corVerde = verde;
        this.corAzul = azul;
    }

    // Método para obter a cor atual da lâmpada como uma String
    public String getCor() {
        return "RGB(" + this.corVermelho + ", " + this.corVerde + ", " + this.corAzul + ")";
    }

    // Método para definir a intensidade do brilho
    public void setBrilho(int brilho) {
        if (brilho < 0 || brilho > 255) {
            throw new IllegalArgumentException("O brilho deve estar entre 0 e 255.");
        }
        this.brilho = brilho;
    }

    // Método para obter a intensidade do brilho atual
    public int getBrilho() {
        return this.brilho;
    }
}
