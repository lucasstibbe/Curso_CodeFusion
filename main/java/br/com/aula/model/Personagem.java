package br.com.aula.model;

public abstract class Personagem {
    private String nome;
    private String raca;

    protected int vida;
    protected int dano;
    protected int energia;
    protected boolean vivo;

    public Personagem(String nome, String raca, int vida, int energia, int dano) {
        this.nome = nome;
        this.raca = raca;
        this.vida = vida;
        this.energia = energia;
        this.dano = dano;
        this.vivo = true;
    }

    public void atacar(Personagem alvo) {
        if (!alvo.isVivo()) {
            System.out.println("O malandro está morto!");
            return;
        }
        if (energia <= 0) {
            alvo.descansar();
            return;
        }
        alvo.receberDano(dano);
        energia -= 1;
    }

    public void descansar() {
        if (energia >= qtMaximaEnergia()) {
            System.out.println("Não é necessário descansar!!");
        }
        vida += 10;
        energia += 3;
        System.out.println(nome + " descansou!");
    }

    // Método abstrato que será utilizado por outros personagens
    public abstract void usarHabilidade(Personagem alvo);


    protected void receberDano(int dano){
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vivo = false;
            System.out.println(nome + " morreu!");
        } else {
            System.out.println(nome + " recebeu " + dano + " de dano! Vida restante: " + vida);
        }
    }


    private int qtMaximaEnergia () {
        return 30;
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getVida()    { return vida; }
    public int getEnergia() { return energia; }
    public int getDano()    { return dano; }
    public boolean isVivo() { return vivo; }
}
