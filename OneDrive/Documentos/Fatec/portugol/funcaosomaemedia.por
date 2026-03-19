programa
{
	
	funcao inicio()
	{
		const inteiro TAM = 3
		inteiro i
		real vet [TAM], s
		para(i = 0; i < TAM; i++){
			escreva("Digite o elemento: ")
			leia(vet[i])
		}
		s = somavet(vet, TAM)
		escreva("Soma = ", s, "\n")

		s = medvet(vet, TAM)
		escreva("Media = ", s, "\n")
	}

	funcao real somavet(real vet[], inteiro tam){
		inteiro i
		real soma
		soma = 0.0
		para(i = 0; i < tam; i++){
			soma = soma + vet[i]
		}
		retorne soma
	}
	funcao real medvet(real vet[], inteiro tam){
		inteiro i
		real soma, media 
		soma = 0.0
		para(i = 0; i < tam; i++){
			soma += vet[i]
		}
		media = soma/tam
		retorne media 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */