programa
{
	
	funcao inicio()
	{
		inteiro penis[2][2], coco[2][2], sexo[2][2]
		inteiro i, j

		escreva("entre com os valores das matrizes:\n")
		escreva("matriz 1\n")
		para(i = 0; i < 2; i++){
			para(j = 0; j < 2; j++){
				leia(penis[i][j])
			}
		}
		escreva("matriz 2\n")
		para(i = 0; i < 2; i++){
			para(j = 0; j < 2; j++){
				leia(coco[i][j])
			}
		}

		escreva("calculando resultados...")
		para(i = 0; i < 2; i++){
			para(j = 0; j < 2; j++){
				sexo[i][j] = penis[i][j] + coco[i][j]
			}

			
			escreva("Resultado pornografico 8===D:\n")
			para(i = 0; i < 2; i++){
				para(j = 0; j < 2; j++){
					escreva(sexo[i][j])
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {penis, 6, 10, 5}-{coco, 6, 23, 4}-{sexo, 6, 35, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */