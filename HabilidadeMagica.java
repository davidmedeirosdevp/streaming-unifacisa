package RPG;

public interface HabilidadeMagica {
    void lancarFeitico(Personagem adversario)
        throws ManaInsuficienteException, PersonagemDerrotadoException;
}
