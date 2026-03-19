programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3], i, j, soma

		soma = 0 
		
		para(j=0; j<3; j++){
			para(i=0; i<3; i++){
			escreva ("Digite o valor: ")
			leia(mat[j][i])
			soma = soma + mat[j][i]
			}
		}
		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */