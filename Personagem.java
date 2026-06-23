package RPG;

public abstract class Personagem {
    private String nome;
    private int pontosVida;
    private int poderAtaque;
    private TipoPersonagem tipo;
    private static int totalPersonagens =0;

    public Personagem(String nome, int pontosVida, int poderAtaque, TipoPersonagem tipo) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.poderAtaque = poderAtaque;
        this.tipo = tipo;
        totalPersonagens++;
    }

    public static int getTotalPersonagens(){
        return totalPersonagens;
    }

    public void receberDano(int dano) throws PersonagemDerrotadoException {
        if (pontosVida <= 0) {
            throw new PersonagemDerrotadoException("O personagem já está derrotado");
        }
        pontosVida -=dano;
    }
    public void receberDano(int dano, boolean defesaAtiva) throws PersonagemDerrotadoException {
        if (pontosVida <= 0) {
            throw new PersonagemDerrotadoException("Personagem já está derrotado");
        }
        if(defesaAtiva== true) {
            dano = dano / 2;
        }
        pontosVida-=dano;

    }
    public final void exibirStatus(){
        System.out.println("Nome: " + nome + "\nTipo: " + tipo + "\nVida atual: " + pontosVida + "\nPoder de Ataque: " + poderAtaque);
    }


    public abstract void lutar(Personagem adversario) throws PersonagemDerrotadoException;

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }
}
