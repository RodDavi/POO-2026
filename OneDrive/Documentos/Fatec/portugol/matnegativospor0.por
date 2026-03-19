programa
{
	
	funcao inicio()
	{
		inteiro mat[6][6], lin, col, neg, i, j

		neg = 0

		escreva("Insira os números desejados:\n")
		para(lin = 0; lin < 6; lin++){
			para(col = 0; col < 6; col++){
				escreva("Insira o valor da linha:\n")
				leia(mat[lin][col])
			}
		}
		para(lin = 0; lin < 6; lin++){
			para(col = 0; col < 6; col++){
				escreva(mat[lin][col], " ")
				se(mat[lin][col] < 0){
					mat[lin][col] = 0
					neg = neg + 1
				}
			}
		}
		escreva("substituição dos negativos por 0")
		para(lin = 0; lin < 6; lin++){
			para(col = 0; col < 6; col++){
				escreva(mat[lin][col], "\n")
			}
		
		}
		escreva("quantidade de valores negativos alterados por 0", neg)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */