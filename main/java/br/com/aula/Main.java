package br.com.aula;

import br.com.aula.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guerreiro samuel = new Guerreiro("Samuel", "Humano");
        Mago gandalf = new Mago("Gandalf", "Mago");
        Arqueiro legolas = new Arqueiro("Legolas", "Elfo");
        Necromante lucas = new Necromante("Lucas", "Mago");

        // TODO: Instanciar um Necromante e um Paladino com nome e raça de sua escolha


        List<Personagem> grupo = new ArrayList<>();
        grupo.add(samuel);
        grupo.add(gandalf);
        grupo.add(legolas);
        grupo.add(lucas);
        // TODO: Adicionar o Necromante e o Paladino ao grupo (polimorfismo em ação!)


        Personagem boss = new Guerreiro("Dragão de Valhalla", "Dragão");

        // Simulando uma batalha
        System.out.println("A batalha começa!");
        System.out.println("Cada guerreiro ataca o chefao");
        for (Personagem personagem : grupo){
            personagem.atacar(boss);
            System.out.println("A primeira rodada de ataques terminou!");
        }

        System.out.println("Agora os personagens usam suas habilidades especiais!");
        for (Personagem personagem : grupo){
            personagem.usarHabilidade(boss);
            System.out.println("A primeira rodada de habilidades especiais terminou!");
        }
    }
}