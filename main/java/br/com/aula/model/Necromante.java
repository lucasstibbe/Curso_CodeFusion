package br.com.aula.model;

// TODO 1: Fazer o Necromante herdar de Personagem (use a palavra-chave extends)
public class Necromante extends Personagem {

    // TODO 2: Declarar o atributo exclusivo do Necromante
    // O Necromante possui "almas" (int) que ele consome para invocar mortos-vivos
    // private int almas;
    private int almas;
    // TODO 3: Criar o construtor e chamar o construtor do PAI com super()
    // Use os valores: vida = 70, energia = 25, dano = 18
    // Inicialize almas = 3

    public Necromante(String nome, String raca) {
        // super(nome, raca, 70, 25, 18);
        // this.almas = 3;
        super(nome, raca, 70, 25, 18);
        this.almas = 3;
    }

    @Override

    public void atacar(Personagem alvo) {
        if (almas > 0) {
            System.out.println(getNome() + " atacou com as suas almas!");
            alvo.receberDano(dano);
            this.vida += dano / 2;
            System.out.println(getNome() + "se curou com " + dano / 2 + " de vida!");
            almas -= 1;
        } else {
            System.out.println(getNome() + " está sem almas, usar ataque básico!");
            super.atacar(alvo);
        }
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        if (almas > 0) {
            System.out.println(getNome() + " usou sua habilidade!");
            alvo.receberDano(dano * 2);
            almas -= 1;
        } else{
            System.out.println(getNome() + " não possui almas suficiente, ataque normal!");
            super.atacar(alvo);
}
        }
    }
    // TODO 4: Sobrescrever o método atacar() com @Override
    // O Necromante drena a vida do alvo e se cura com metade do dano causado
    // Dica: this.vida += dano / 2;
    // Exiba uma mensagem descrevendo a drenagem de vida

    // TODO 5: Implementar o método usarHabilidade() com @Override
    // É um método ABSTRATO em Personagem — o compilador vai reclamar se não implementar!
    // Lógica: se almas > 0, causa dano * 2 no alvo e reduz almas em 1
    //         senão, exibe mensagem de que não tem almas suficiente
