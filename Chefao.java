package RPG;

public final class Chefao extends Personagem implements Apresentavel {
    private boolean furia;

    public boolean isFuria() {
        return furia;
    }

    public void setFuria(boolean furia) {
        this.furia = furia;
    }

    public Chefao(String nome, int pontosVida, int poderAtaque, TipoPersonagem tipo, boolean furia) {
        super(nome, pontosVida, poderAtaque, tipo);

        this.furia = furia;
    }

    @Override
    public void lutar(Personagem adversario) throws PersonagemDerrotadoException {
        int dano = getPoderAtaque();
        if(furia==true){
            dano = dano*2;
        }
        System.out.println("O Chefão " + getNome() + " esmagou " + adversario.getNome());
        adversario.receberDano(dano);
        if(adversario.getPontosVida()<0){
            System.out.println("VITÓRIA! " + getNome() + " ganhou a luta");
        }
    }
    public void apresentar(){
        System.out.println("Sou o Chefão " + getNome() + "e irei ganhar todas as lutas!");
    }
}


