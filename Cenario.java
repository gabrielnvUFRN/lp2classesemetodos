public class Cenario {
    private String nomeFundo;
    private int largura;
    private int altura;
    private int[] posicoesObstaculos;
    private boolean dia;

    public Cenario(String nomeFundo, int largura, int altura) {
        this.nomeFundo = nomeFundo;
        this.largura = largura;
        this.altura = altura;
        this.posicoesObstaculos = new int[10]; // Exemplo de 10 obstáculos
        this.dia = true; // Inicialmente dia
    }

    public void mudarTempo() {
        this.dia = !dia;
        System.out.println("O cenário agora é " + (dia ? "dia" : "noite") + ".");
    }

    public void adicionarObstaculo(int posicao) {
        for (int i = 0; i < posicoesObstaculos.length; i++) {
            if (posicoesObstaculos[i] == 0) {
                posicoesObstaculos[i] = posicao;
                System.out.println("Obstáculo adicionado na posição: " + posicao);
                break;
            }
        }
    }

    public void removerObstaculo(int posicao) {
        for (int i = 0; i < posicoesObstaculos.length; i++) {
            if (posicoesObstaculos[i] == posicao) {
                posicoesObstaculos[i] = 0;
                System.out.println("Obstáculo removido da posição: " + posicao);
                break;
            }
        }
    }

    public void moverCenario() {
        System.out.println("O cenário está se movendo para a esquerda.");
    }

    public void resetar() {
        System.out.println("Cenário foi reiniciado.");
    }
}
