package br.com.aula.model;

public class Batalha {
    private Personagem combatente1;
    private Personagem combatente2;
    private int turno;

    public Batalha(Personagem combatente1, Personagem combatente2) {
        this.combatente1 = combatente1;
        this.combatente2 = combatente2;
        this.turno = 0;
    }

    public void executarTurno() {
        if (turno > 10) {
            System.out.println("Acabou os turnos da batalha");
            return;
        }
        if (temVencedor()) {
            return;
        }
        turno++;

        combatente2.atacar(combatente1);
        combatente1.atacar(combatente2);
    }

    public boolean temVencedor() {
        return !combatente1.isVivo() | !combatente2.isVivo();
    }

    public void exibirVencedor() {
        if (!combatente1.isVivo() && !combatente2.isVivo()) {
            System.out.println("Empate, os dois perderam");
        } else if (!combatente1.isVivo() && combatente2.isVivo()) {
            System.out.println(combatente2.getNome() + " é o vencedor");
        } else if (combatente1.isVivo() && !combatente2.isVivo()) {
            System.out.println(combatente1.getNome() + " é o vencedor");
        }
    }

    public int getTurno() {
        return turno;
    }
}
