#### TPA 26 de agosto 2019

#### おやすみペペロ

###### Todo conteúdo copiado exatamente como foi passado por luiz papyrus

> Com comentários meus, se necessário!

---

``` java
Package palavra chave
Import java.util.scanner;
Public class leituras3;
	Public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = ler.next();/
        System.out.println("Digite seu endereço");
        Ler.nextLine();
        String endereço = ler.nextLine();
        System.out.println("Digite seu recado");
        String recado = ler.nextLine();
        System.out.println("Resultado: \n" + nome +"\n" + enedereço + "\n" + recado);
        
    }
```

### Vetores

Um vetor pode armazenar todos os tipo primitivos e até instâncias de classes (objetos), porém todos os elementos do vetor só podem ser um único. Para declarar um vetor, o procedimento é semelhante à declaração de uma variável comum, porém é necessário colocar o índice entre colchetes "[]". É possível omitir esse número apenas se o vetor for iniciado com seu conteúdo entre chaves "[]", exemplo: String[] respostas = {"sim", "sim"};

Como exemplo uma classe que receba a quantia de determinados objetos, entra na execução, no caso a de seis idades e a cada loop, será perguntado se deseja continuar:

Exemplo:

```java
Public static void main(String[] args){
    Int[] idades = new int[6];
    String[] respostas = {"sim", "sim"};
    For (int i=0; i<6; i++) {
        Idades[i] = ...
    }
}
```

### Exercícios

	##### Ex. 1

Crie um vetor se Strings chamado "MESES" e inicie-o com nomes de todos os meses do ano. então crie um laço WHILE para exibir todos esses meses. 

> Lembre que String[] inicia no índice 0 ;)



##### Ex. 2

Permita que um usuário digite mês a mês o nome do funcionários responsável pelas máquinas aonde poderá sentar à frente. depois exiba em relatório em uma ``` JOptionPane``` o número do mês seguido do nome deste usuário

> Essa eh dificil bicho :o



## Resolução!

##### Ex. 1

```
VAR
	INT: 
```

``` java
Package meses
Import ;
Public static void main(String[] args){
    String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}
    	int i = 0;
		while(i<12){
        System.out.println(meses[i]);
        System.out.println("------");
        i++;
    }
}
```

##### Ex.2 

```
VAR
```

```java
Package nome funcionário
Import ;
Public static void main(String[] args){
        String[][] tudo = new String [1][11];
    	tudo[0][] = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}
}

```

