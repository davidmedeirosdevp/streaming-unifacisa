package RPG;

public class Mago extends Personagem implements Apresentavel, HabilidadeMagica {
    private int mana;

    public Mago(String nome, int pontosVida, int poderAtaque, TipoPersonagem tipo, int mana) {
        super(nome, pontosVida, poderAtaque, tipo);
        this.mana = mana;
    }

    @Override
    public void lutar(Personagem adversario) throws PersonagemDerrotadoException {
        int dano = getPoderAtaque();
        System.out.println("O mago " + getNome() + " golpeou " + adversario.getNome() + " com seu cajado!");
        adversario.receberDano(dano);
        if (adversario.getPontosVida() < 0) {
            System.out.println("VITÓRIA! O " + getNome() + " venceu a luta e derrotou o " + adversario.getNome());
        }
    }

    public void lancarFeitico(Personagem adversario)
        throws ManaInsuficienteException, PersonagemDerrotadoException {
        if (mana < 20) {
            throw new ManaInsuficienteException("Mana Insuficiente!");
        }
        mana -= 20;
        int dano = getPoderAtaque() * 3;
        System.out.println("O mago " + getNome() + " lançou um feitiço em " + adversario.getNome());
        adversario.receberDano(dano);

        if (adversario.getPontosVida() < 0) {
            System.out.println("VITÓRIA! O " + getNome() + " venceu a luta!!");

        }
    }
    public void apresentar(){
            System.out.println("Sou o mago " + getNome() + " e domino as magias!!");

    }
}

