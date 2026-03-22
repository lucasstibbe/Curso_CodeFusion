package br.com.aula.model;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, String raca) {
        super(nome, raca, 80, 30, 15);
        this.mana = 100;
    }

    @Override
    public void atacar(Personagem alvo){
        if (mana >= 20) {
            System.out.println(getNome() + " lança uma bola de fogo!");
            alvo.receberDano(dano * 2);
        }else{
            System.out.println(getNome() + " está sem mana! Ataca com o cajado!");
            super.atacar(alvo);
        }
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println(getNome() + "Conjura cura! Recupera 30 de vida");
        this.vida += 30;
        this.mana -= 20;
    }

    public int getMana() { return mana; }
}
