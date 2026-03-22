package br.com.aula.model;

// TODO 1: Fazer o Paladino herdar de Personagem (use a palavra-chave extends)
public class Paladino {

    // TODO 2: Declarar o atributo exclusivo do Paladino
    // O Paladino possui "fe" (int) que alimenta seus poderes divinos
    // private int fe;

    // TODO 3: Criar o construtor e chamar o construtor do PAI com super()
    // Use os valores: vida = 120, energia = 20, dano = 20
    // Inicialize fe = 5
    public Paladino(String nome, String raca) {
        // super(nome, raca, 120, 20, 20);
        // this.fe = 5;
    }

    // TODO 4: Sobrescrever o método atacar() com @Override
    // O Paladino golpeia com luz divina — pode reaproveitar o atacar() do pai
    // Dica: super.atacar(alvo) já resolve! Só adicione uma mensagem antes.

    // TODO 5: Implementar o método usarHabilidade() com @Override
    // É um método ABSTRATO em Personagem — o compilador vai reclamar se não implementar!
    // Lógica: cura 40 de vida e exibe uma mensagem de bênção divina
    //         bônus: diminua fe em 1 a cada uso e bloqueie quando fe = 0
}
