### Diferen�as Terminol�gicas
No �ltimo exemplo, foram utilizados tr�s m�todos na mesma **classe** e, como foi utilizado o *main()* como o principal, sendo que iniciou a execu��o e chamou ao conte�do dos outros.

## Procedimento 
Que realiza  sua fun��o, mas n�o devolve nenhum conte�do que o invocou, apenas realiza o seu c�digo, por exemplo, exibindo mensagens, fazendo c�lculos, salvando informa��es no Banco de Dados..

## Fun��o
Utiliza em outros pontos do programa e retorna um valor que ser� utilizado e al�m, de executar todas as suas instru��es (procedimentos).
Na O,O, n�o h� distin��o de termos entre os m�todos que tem, e os que n�o tem retorno e, mas na assinatura dso m�todo, deve estar escrito expressamente **void** caso n�o haja nenhuma retorno, e , no caso de haver retorno, ent�o o tipo retorno deve estar no mesmo lugar.
Nesse caso, uma var�vel ou um objeto � retornado e aproveitado adequadamente em java, quando escreve-se a palavra chave **return**, como no exemplo de uma pequena calculadora:
```java
{
    Package exemplocalculadoraemmetodos;
    Public class Exemplocalculadoraemmetodos {
	    Public static int somar (int numero), int numero2) {
		    Return numero1 + numero2;
		    }
		    Public static int subtrair (int numero1, numero2){
			    Return numero - numero2;
			}
	}
	Public static void main(String [] args){
	int numero1 = 10;
	int numero2 = 5;
	int ResultadoSoma = somar(numero1, numero2);
	int resultadoSubtra��o = subtrair (numero1, numero2);
	System.out.println("soma:" + resultadoSoma);
	System.out.println("subtra��o:" + resultadoSubtra��o):
	}
}
