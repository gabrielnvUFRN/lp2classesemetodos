public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        System.out.println("A lâmpada está acesa? " + lampada.isAcesa());
        System.out.println("Cor inicial: " + lampada.getCor());
        System.out.println("Brilho inicial: " + lampada.getBrilho());

        lampada.acender();
        System.out.println("A lâmpada está acesa? " + lampada.isAcesa());

        lampada.setCor(128, 200, 255);  // Define uma cor azul claro
        lampada.setBrilho(150);         // Define um brilho intermediário

        System.out.println("Nova cor: " + lampada.getCor());
        System.out.println("Novo brilho: " + lampada.getBrilho());

        lampada.desligar();
        System.out.println("A lâmpada está acesa? " + lampada.isAcesa());
    }
}

