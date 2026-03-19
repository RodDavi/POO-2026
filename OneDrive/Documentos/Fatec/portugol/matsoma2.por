programa
{
	
	funcao inicio()
	{
		inteiro mat1[3][3], mat2[3][3], resu[3][3]
		inteiro i, j
		

		escreva("insira os numeros da primeira matriz:")

		para(i = 0; i < 3; i++){
			para(j = 0; j < 3; j++){
			leia(mat1[i][j])
			}
		}

		escreva("insira os numeros da segunda matriz:")
		para(i = 0; i < 3; i++){
			para(j = 0; j < 3; j++){
			leia(mat2[i][j])
			}
		}

		para(i = 0; i > 3; i++){
			para(j = 0; j < 3; j++){
			resu[i][j] = mat1[i][j] + mat2[i][j]
			escreva(resu[i][j])
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat1, 6, 10, 4}-{mat2, 6, 22, 4}-{resu, 6, 34, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */