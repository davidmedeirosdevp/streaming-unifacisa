package RPG;

public class Guerreiro extends Personagem implements Apresentavel{
    private int forcaFisica;

    public Guerreiro(String nome, int pontosVida, int poderAtaque, TipoPersonagem tipo, int forcaFisica) {
        super(nome, pontosVida, poderAtaque, tipo);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void lutar(Personagem adversario) throws PersonagemDerrotadoException {
        int dano = getPoderAtaque() + forcaFisica;
        System.out.println("O guerreiro " + getNome() + " atacou " + adversario.getNome() + " com sua espada!");
        adversario.receberDano(dano);
        if(adversario.getPontosVida()<0){
            System.out.println("VITÓRIA! O " + getNome() + " venceu a luta e derrotou o " + adversario.getNome() + "!");
        }
    }
    public void apresentar(){
        System.out.println("Sou o guerreiro " + getNome() + " e vou lhe matar!");
    }
}
