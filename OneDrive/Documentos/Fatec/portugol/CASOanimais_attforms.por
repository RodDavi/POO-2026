programa
{
	
	//inclua biblioteca Texto --> TXT
		caracter RPT1, RPT2, RPT3, RPT4, RPT5, RPT6

	funcao inicio()
	{

		escreva("Responda com 'S' para sim ou 'N' para não.\n\n")

		escreva("O animal é vertebrado?\n> ")
		leia(RPT1)
		//RPT1 = TXT.caixa_alta(RPT1)

		//OBS: Não é possível utlizar o comando de caixa alta para caracteres,
		//	  diferente da cadeia, que antes foi utilizado para outros códigos.
		
		limpa()
										
		escolha(RPT1)
		{
			caso 'S':
				escreva("É mamífero?\n> ")
				leia(RPT2)
				limpa()

				escolha(RPT2)
				{
					caso 'S':
						escreva("Ele voa?\n> ")
						leia(RPT3)
						limpa()

						escolha(RPT3)
						{
						
							caso 'S':
								escreva("O animal é: Morcego\n\n")
							pare

							caso 'N':
								escreva("Vive na terra?\n> ")
								leia(RPT4)
								limpa()
		
								escolha(RPT4)
								{
									caso 'S':
										escreva("É onívoro?\n> ")
										leia(RPT5)
										limpa()
		
										escolha(RPT5)
										{
											caso 'S':
												escreva("É racional?\n> ")
												leia(RPT6)
												limpa()
												
												escolha(RPT6)
												{
													caso 'S':
														escreva("Este é o Homem.\n\n")
													pare
													
													caso 'N':
														escreva("O animal é: Macaco\n\n")
													pare
												}
											pare
											
											caso 'N':
												escreva("É carnívoro?\n> ")
												leia(RPT6)
												limpa()
		
												escolha(RPT6)
												{
													caso 'S':
													escreva("O animal é: Leão\n\n")
													pare
		
													caso 'N':
													escreva("O animal é: Cavalo\n\n")
												}
											pare
										}
									pare
		
									caso 'N':
										escreva("O animal é: Baleia\n\n")
									pare
								}
							pare
						}
					pare

					caso 'N':
						escreva("É ave?\n> ")
						leia(RPT3)
						limpa()

						escolha(RPT3)
						{
							caso 'S':
								escreva("Voa?\n> ")
								leia(RPT4)
								limpa()

								escolha(RPT4)
								{
									caso 'S':
										escreva("Nada?\n> ")
										leia(RPT5)
										limpa()

										escolha(RPT5)
										{
											caso 'S':
												escreva("O animal é: Pato\n\n")
											pare

											caso 'N':
												escreva("O animal é: Águia\n\n")
											pare
										}
									pare

									caso 'N':
										escreva("Ele é nadador?\n> ")
										leia(RPT5)
										limpa()

										escolha(RPT5)
										{
											caso 'S':
												escreva("O animal é: Pinguim\n\n")
											pare
											
											caso 'N':
												escreva("O animal é: Avestruz\n\n")
											pare
										}

								}
							pare

							caso 'N':
								escreva("É réptil?\n> ")
								leia(RPT4)
								limpa()

								escolha(RPT4)
								{
									caso 'S':
										escreva("Tem casco?\n> ")
										leia(RPT5)
										limpa()

										escolha(RPT5)
										{
											caso 'S':
												escreva("O animal é: Tartaruga\n\n")
											pare

											caso 'N':
												escreva("O animal é: Crocodilo\n\n")
											pare
										}
									pare

									caso 'N':
										escreva("O animal é: Cobra\n\n")
									pare
								}
							pare
						}
					pare
				}
			pare

			caso 'N':
				escreva("Negado: Insetos ou invertebrados não estão listados.\n\n")
			pare

			caso contrario:
				escreva("Entrada inválida: Reinicie o programa e digite apenas 'S' ou 'N' (Com caixa alta).\n\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */