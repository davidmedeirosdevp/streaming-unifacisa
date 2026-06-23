package Streaming;

public class Main {
    public static void main(String[] args){
        Filme filme = new Filme("Harry Potter", ClassificacaoIndicativa.DEZOITO_ANOS, 1997);
        Musica musica = new Musica("Tentativas em vão", ClassificacaoIndicativa.LIVRE, 2004);

        Catalogo catalogo = new Catalogo();
        catalogo.adicionarConteudo(filme);
        catalogo.adicionarConteudo(musica);

        catalogo.buscar("Harry Potter");
        catalogo.buscar("Dois homens e meio");
        catalogo.buscar(ClassificacaoIndicativa.DEZOITO_ANOS);
        catalogo.buscar(ClassificacaoIndicativa.DOZE_ANOS);
        System.out.println(filme.calcularRoyalties());
        System.out.println(musica.calcularRoyalties());
    }
}
