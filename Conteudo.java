package Streaming;

public abstract class Conteudo {
    protected String titulo;
    protected ClassificacaoIndicativa classificacao;
    protected int reproducoes;

    public Conteudo(String titulo, ClassificacaoIndicativa classificacao, int reproducoes) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.reproducoes = reproducoes;
    }

    public abstract double calcularRoyalties();
}
