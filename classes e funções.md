### Diferenças Terminológicas
No último exemplo, foram utilizados três métodos na mesma **classe** e, como foi utilizado o *main()* como o principal, sendo que iniciou a execução e chamou ao conteúdo dos outros.

## Procedimento 
Que realiza  sua função, mas não devolve nenhum conteúdo que o invocou, apenas realiza o seu código, por exemplo, exibindo mensagens, fazendo cálculos, salvando informações no Banco de Dados..

## Função
Utiliza em outros pontos do programa e retorna um valor que será utilizado e além, de executar todas as suas instruções (procedimentos).
Na O,O, não há distinção de termos entre os métodos que tem, e os que não tem retorno e, mas na assinatura dso método, deve estar escrito expressamente **void** caso não haja nenhuma retorno, e , no caso de haver retorno, então o tipo retorno deve estar no mesmo lugar.
Nesse caso, uma varável ou um objeto é retornado e aproveitado adequadamente em java, quando escreve-se a palavra chave **return**, como no exemplo de uma pequena calculadora:
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
	int resultadoSubtração = subtrair (numero1, numero2);
	System.out.println("soma:" + resultadoSoma);
	System.out.println("subtração:" + resultadoSubtração):
	}
}
```
