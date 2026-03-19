programa
{
	
	funcao inicio()
	{
		inteiro idade, veti[5], i, cont
		caracter vets[5]

		cont = 0
		
		para(i = 0; i < 5; i++){
			escreva("Digite sua idade e seu sexo, sendo m para masculino e f para feminino:\n")
			leia(veti[i])
			leia(vets[i])
		}

		para(i = 0; i < 5; i++){
		se(veti[i] < 21 e vets[i] == 'm'){
			cont = cont + 1
		}
		}
			escreva("quantidade de homens menores de 21 anos é: ", cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {veti, 6, 17, 4}-{vets, 7, 11, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */