programa
{
	
	funcao inicio()
	{
		inteiro vet[30], i

			vet[0] = 1
			vet[1] = 1
			
		para(i = 2; i < 30; i++){
			vet[i] = vet[i - 1] + vet[i - 2]
		}
		para(i = 0; i < 30; i++){
			escreva(vet[i], "\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */