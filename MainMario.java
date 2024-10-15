public class MainMario {
    public static void main(String[] args) {
        // Criando o personagem Mario
        Mario mario = new Mario("Mario");
        
        // Criando um cenário
        Cenario cenario = new Cenario("Cenário da Floresta", 800, 600);
        
        // Criando um inimigo Goomba
        Inimigo goomba = new Inimigo("Goomba", 1, 1, 400);
        
        // Criando um item (cogumelo)
        Item cogumelo = new Item("Cogumelo", "Cogumelo", 300, 1);
        
        // Criando um bloco que contém uma moeda
        Bloco blocoSurpresa = new Bloco("Surpresa", 200, 100, true);
        
        // Ações no jogo
        System.out.println("### INÍCIO DO JOGO ###");

        // Mario anda e coleta moeda
        mario.andar();
        mario.coletarMoeda();
        
        // Mario pula
        mario.pular();
        
        // Mario encontra o bloco surpresa e quebra o bloco
        blocoSurpresa.soltarItem(mario);
        blocoSurpresa.quebrar();
        
        // Mario encontra um cogumelo
        cogumelo.coletar(mario);
        
        // Inimigo Goomba se move e ataca Mario
        goomba.mover();
        goomba.atacar(mario);
        
        // Cenário muda de dia para noite
        cenario.mudarTempo();
        
        // Mario continua andando e encontra mais um inimigo
        mario.andar();
        
        // Mario derrota o inimigo
        goomba.perderVida();
        
        // Reaparecendo o bloco e cogumelo para simular ciclo de jogo
        blocoSurpresa.reaparecer();
        cogumelo.reaparecer();
        
        // Cenário se move
        cenario.moverCenario();
        
        System.out.println("### FIM DO JOGO ###");
    }
}
