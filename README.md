# streaming-unifacisa

> Sistema simples de plataforma de streaming em Java para demonstrar orientacao a objetos, heranca, polimorfismo e sobrecarga de metodos.

## Visao Geral

O projeto trabalha com tres pontos centrais:

| Funcao | Descricao |
| --- | --- |
| Cadastro | Adiciona conteudos no catalogo. |
| Busca | Localiza conteudos por titulo ou classificacao indicativa. |
| Royalties | Calcula valores diferentes para filmes e musicas. |

O `Main` monta objetos de exemplo e executa chamadas para mostrar o comportamento das classes.

## Estrutura

| Arquivo | Papel no sistema |
| --- | --- |
| `Conteudo.java` | Classe abstrata base para qualquer item do streaming. |
| `Filme.java` | Especializacao de `Conteudo` com regra propria de royalties. |
| `Musica.java` | Especializacao de `Conteudo` com regra propria de royalties. |
| `Catalogo.java` | Armazena os conteudos e disponibiliza buscas. |
| `ClassificacaoIndicativa.java` | Enum com as classificacoes disponiveis. |
| `Main.java` | Ponto de entrada da aplicacao. |

## Classes e Metodos

### `Conteudo`

Classe abstrata que representa qualquer item do catalogo.

| Campo | Descricao |
| --- | --- |
| `titulo` | Nome do conteudo. |
| `classificacao` | Classificacao indicativa. |
| `reproducoes` | Quantidade de reproducoes. |

Metodo principal:

| Metodo | Descricao |
| --- | --- |
| `calcularRoyalties()` | Obriga cada tipo de conteudo a definir sua propria regra de calculo. |

### `Filme`

Representa um filme no catalogo.

| Metodo | Retorno |
| --- | --- |
| `calcularRoyalties()` | `reproducoes * 1.50` |

### `Musica`

Representa uma musica no catalogo.

| Metodo | Retorno |
| --- | --- |
| `calcularRoyalties()` | `reproducoes * 0.05` |

### `Catalogo`

Responsavel por guardar os conteudos e oferecer buscas.

| Metodo | Funcao |
| --- | --- |
| `adicionarConteudo(Conteudo conteudo)` | Adiciona um filme ou uma musica ao catalogo. |
| `buscar(String titulo)` | Procura um conteudo pelo titulo exato. |
| `buscar(ClassificacaoIndicativa classificacao)` | Lista os conteudos com a classificacao informada. |

### `Main`

Classe de demonstracao do sistema.

Ela cria um filme e uma musica, adiciona os dois ao catalogo, executa buscas por titulo e por classificacao e imprime os royalties calculados.

## Funcionalidades

- Cadastro de conteudos no catalogo.
- Busca de conteudos por nome.
- Busca de conteudos por classificacao indicativa.
- Calculo de royalties com regras diferentes para cada tipo de conteudo.
- Demonstra reutilizacao de codigo com heranca e polimorfismo.

## Como Executar

Como os arquivos usam o pacote `Streaming`, compile e execute a partir da pasta raiz do projeto.

```bash
javac -d out *.java
java -cp out Streaming.Main
```

## Fluxo de Exemplo

O `Main` atual executa um fluxo simples com:

| Entrada | Resultado esperado |
| --- | --- |
| `Harry Potter` | Conteudo encontrado. |
| `Dois homens e meio` | Conteudo nao encontrado. |
| `DEZOITO_ANOS` | Lista os conteudos dessa classificacao. |
| `DOZE_ANOS` | Nenhum conteudo encontrado. |
| `Harry Potter` e `Tentativas em vao` | Exibicao dos royalties calculados. |
