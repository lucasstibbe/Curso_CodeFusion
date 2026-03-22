package br.com.aula.model;

// Irá extender a classe de Personagem
public class Guerreiro extends Personagem {
    private int escudo;

    public Guerreiro(String nome, String raca) {
        super(nome, raca, 150, 20, 25);
        this.escudo = 50;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atacou com sua espada!");

        // Nosso guerreiro tem dano multiplicado por 2x
        alvo.receberDano(dano * 2);
         energia -= 1;
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println(getNome() + " usou a habilidade de escudo!");
        this.vida += escudo;
    }
}
