programa
{
	inteiro N, SOMA

	funcao inicio()
	{
		SOMA = 0

		para(N = 1; N <= 500; N++)
		{
			se(N % 2 != 0 e N % 3 == 0)
			{
				SOMA = SOMA + N
			}
		}

		escreva("A soma de todos os números ímpares múltiplos de 3 de 1 até 500 é: ", SOMA, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */