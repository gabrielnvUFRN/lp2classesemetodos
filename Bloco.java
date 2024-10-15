public class Bloco {
    private String tipo;
    private int posicaoX;
    private int posicaoY;
    private boolean quebrado;
    private boolean contemItem;

    public Bloco(String tipo, int posicaoX, int posicaoY, boolean contemItem) {
        this.tipo = tipo;           // Tipo pode ser "Tijolo", "Moeda", "Surpresa"
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.quebrado = false;
        this.contemItem = contemItem;
    }

    public void quebrar() {
        if (!quebrado) {
            this.quebrado = true;
            System.out.println("O bloco foi quebrado!");
        } else {
            System.out.println("O bloco já está quebrado.");
        }
    }

    public void soltarItem(Mario mario) {
        if (contemItem && !quebrado) {
            System.out.println("Um item saiu do bloco!");
            Item item = new Item("Moeda", "Moeda", posicaoX, 0);
            item.coletar(mario);
            contemItem = false;
        } else {
            System.out.println("O bloco não contém nenhum item.");
        }
    }

    public void mover(int novaPosicaoX, int novaPosicaoY) {
        this.posicaoX = novaPosicaoX;
        this.posicaoY = novaPosicaoY;
        System.out.println("O bloco foi movido para a posição: (" + posicaoX + ", " + posicaoY + ")");
    }

    public void reaparecer() {
        this.quebrado = false;
        System.out.println("O bloco reapareceu.");
    }

    public void animar() {
        System.out.println("O bloco " + tipo + " está se movendo.");
    }
}
