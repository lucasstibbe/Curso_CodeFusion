package br.com.aula.model;

public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro(String nome, String raca) {
        super(nome, raca, 90, 25, 20);
        this.flechas = 10;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            System.out.println(getNome() + " atirou uma flecha!");
            alvo.receberDano(dano);
            flechas--;
        } else {
            System.out.println(getNome() + " está sem flechas! Ataca com a espada!");
            super.atacar(alvo);
        }
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        if (flechas >= 2){
            System.out.println(getNome() + " usou a habilidade de TIRO DUPLO!");
            alvo.receberDano(dano * 2);
            flechas -= 2;
        } else {
            System.out.println(getNome() + " está sem flechas! Ataca com a espada!");
            super.atacar(alvo);
        }
    }

    public int getFlechas() { return flechas; }
}
