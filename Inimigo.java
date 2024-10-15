public class Inimigo {
    private String tipo;
    private int vida;
    private int dano;
    private int posicaoX;
    private boolean ativo;

    public Inimigo(String tipo, int vida, int dano, int posicaoX) {
        this.tipo = tipo;
        this.vida = vida;
        this.dano = dano;
        this.posicaoX = posicaoX;
        this.ativo = true;
    }

    public void mover() {
        this.posicaoX -= 2;  // Inimigo se move para a esquerda
        System.out.println(tipo + " se moveu para a posição: " + posicaoX);
    }

    public void atacar(Mario mario) {
        System.out.println(tipo + " atacou " + mario.getNome() + " causando " + dano + " de dano.");
        mario.perderVida();
    }

    public void perderVida() {
        this.vida--;
        if (this.vida <= 0) {
            this.ativo = false;
            System.out.println(tipo + " foi derrotado.");
        } else {
            System.out.println(tipo + " perdeu uma vida. Vidas restantes: " + vida);
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void reaparecer() {
        this.ativo = true;
        this.vida = 3;
        System.out.println(tipo + " reapareceu no jogo.");
    }
}
