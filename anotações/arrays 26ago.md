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
	CARACTER: meses[0..11];
	INTEIRO: i;
INÍCIO
	meses[0..11] <- "janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro";
	i <- 0;
	ENQUANTO i for menor que 12 FAÇA
		ESCREVA meses[i];
		ESCREVA "------";
		i <- i + 1;
	FIM_ENQUANTO
FIM
	
```

``` java
package meses;
public class Meses {
    public static void main(String[] args) {
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    	int i = 0;
		while(i<12){
        System.out.println(meses[i]);
        System.out.println("------");
        i++;
    }
    }
    
}
```

##### Ex.2 

```
VAR
	CARACTERE: meses[0..11], a;
	INT: i;
INICIO
	meses[0..11] <- "janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro";
	PARA ( seja i igual a 0; enquanto i for menor que 12; incremente i em 1)
		ESCREVA "Qual funcionario do mes de " + meses[i] + "?";
		LEIA A;
		meses[i] <- i + a;
	FIM_PARA
	PARA (seja i igual a 0; enquanto i for menor que 12; incremente i em 1)
		ESCREVA meses[i];
	FIM_PARA
FIM
```

```java
package nomes;
import javax.swing.JOptionPane;
public class Nomes {
    public static void main(String[] args) {
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        for(int i = 0;i<12; i++){
        System.out.println("Qual funcionario do mes de " + meses[i] + "?");
        String a = JOptionPane.showInputDialog("Qual o nome?");
        meses[i] = i + a;
        
        
    } for(int i =0; i<12; i++){
        System.out.println(meses[i]);
    }
}
}

```

