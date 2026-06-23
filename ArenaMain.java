package RPG;
import java.util.ArrayList;

public class ArenaMain {
    public static void main(String[] args){
        try {
            Guerreiro guerreiro = new Guerreiro("Zeca", 200, 30, TipoPersonagem.GUERREIRO, 20);
            Mago mago = new Mago("Mestre dos magos", 90, 20, TipoPersonagem.MAGO, 20);
            Chefao chefao = new Chefao("T.", 200, 150, TipoPersonagem.CHEFAO, true);

            System.out.println("Total de personagens: " + Personagem.getTotalPersonagens());
            guerreiro.apresentar();
            mago.apresentar();
            chefao.apresentar();
            ArrayList<Personagem> arena = new ArrayList<>();
            arena.add(guerreiro);
            arena.add(mago);
            arena.add(chefao);
            for (Personagem personagem : arena) {
                personagem.exibirStatus();
                System.out.println("-------------------------");
            }
            guerreiro.lutar(mago);
            mago.lutar(guerreiro);
            guerreiro.lutar(chefao);
            mago.lancarFeitico(chefao);
            chefao.lutar(guerreiro);
            mago.lancarFeitico(chefao);
            mago.lancarFeitico(chefao);
            mago.lutar(guerreiro);
            mago.lutar(guerreiro);
            mago.lutar(guerreiro);

        } catch (ManaInsuficienteException e){
            System.out.println("Erro de mana: " + e.getMessage());
        } catch (PersonagemDerrotadoException e){
            System.out.println("Erro de personagem: " + e.getMessage());
        }
    }
}
