# Como rodar o projeto

## Pré-requisitos:

Tenha **java** e **maven** instalados na sua máquina

[Tutorial de instalação **java**](https://www.youtube.com/watch?v=KwaGEF3asQQ)

[Tutorial de instalação **maven**](https://www.youtube.com/watch?v=-ucX5w8Zm8s)

## Rodar Local:

### Etapa 1
Compile linguagem que quer executar

```sh
cd <Linguagem>
mvn clean generate-sources compile exec:java
```

### Etapa 2

Rode o arquivo .class compilado. Esteja no mesmo diretório que usou para compilar e rode o comando abaixo:

```sh
java -cp .\target\classes {linguagem}.plp.expressions1.parser.Exp1Parser
```

Substitua {linguagem} por le1, le2, le3, lf1, lf2, etc, a depender da linguagem que você compilou no passo anterior.

## Applet

### Etapa 1

Compile localmente todas as linguagens de programação seguindo a **Etapa 1** do tutorial de rodar **Local**.

### Etapa 2

Volte para a raiz do projeto e execute :

