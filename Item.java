public class Item {
    private String nome;
    private String tipo;
    private int posicaoX;
    private int efeito;
    private boolean coletado;

    public Item(String nome, String tipo, int posicaoX, int efeito) {
        this.nome = nome;
        this.tipo = tipo;       // Pode ser "Moeda", "Cogumelo", "Flor"
        this.posicaoX = posicaoX;
        this.efeito = efeito;   // O efeito pode ser aumentar vida, força, etc.
        this.coletado = false;
    }

    public void coletar(Mario mario) {
        if (!coletado) {
            coletado = true;
            System.out.println(mario.getNome() + " coletou o item: " + nome);
            aplicarEfeito(mario);
        }
    }

    private void aplicarEfeito(Mario mario) {
        if (tipo.equals("Cogumelo")) {
            mario.crescer();
        } else if (tipo.equals("Flor")) {
            System.out.println(mario.getNome() + " pode agora lançar bolas de fogo.");
        } else if (tipo.equals("Moeda")) {
            mario.coletarMoeda();
        }
    }

    public void reaparecer() {
        this.coletado = false;
        System.out.println(nome + " reapareceu no cenário.");
    }

    public boolean isColetado() {
        return coletado;
    }

    public void mover(int novaPosicao) {
        this.posicaoX = novaPosicao;
        System.out.println(nome + " se moveu para a posição: " + posicaoX);
    }
}
