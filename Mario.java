public class Mario {
    private String nome;
    private int vida;
    private int moedas;
    private int posicaoX;
    private int velocidade;

    public Mario(String nome) {
        this.nome = nome;
        this.vida = 3;          // Mario começa com 3 vidas
        this.moedas = 0;
        this.posicaoX = 0;
        this.velocidade = 5;    // Velocidade inicial de movimento
    }

    public void andar() {
        this.posicaoX += velocidade;
        System.out.println(nome + " andou para a posição: " + posicaoX);
    }

    public void pular() {
        System.out.println(nome + " pulou.");
    }

    public void coletarMoeda() {
        this.moedas++;
        System.out.println(nome + " coletou uma moeda. Total de moedas: " + moedas);
    }

    public void perderVida() {
        this.vida--;
        System.out.println(nome + " perdeu uma vida. Vidas restantes: " + vida);
    }

    public void crescer() {
        System.out.println(nome + " pegou um cogumelo e cresceu!");
    }
}
