programa 
{
	funcao inicio ()
	{
		real vclasse[10]
		inteiro i, notaacima
		real soma, media

		soma = 0.0
		notaacima = 0

		para(i = 0; i < 10; i++){
			escreva("Digite a ", i + 1, "ª nota: ")
			leia(vclasse[1])
			soma = soma + vclasse[1]
		}

		media = soma / 10

		para(i = 0; i < 10; i++){
			se(vclasse[1] > media){
				notaacima = notaacima + 1
			}
		}
		escreva("média: ", media, "\n")
		escreva("quantidade: ", notaacima)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */