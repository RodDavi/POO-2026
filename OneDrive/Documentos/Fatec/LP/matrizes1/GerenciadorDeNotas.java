import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GerenciadorDeNotas {

    public static void main(String[] args) {
        // 1. Definição de Constantes
        final int NUM_ALUNOS = 5;
        final int NUM_NOTAS_PARA_MEDIA = 4;
        final int COLUNA_MEDIA = 4; // A 5ª coluna (índice 4) será para a média

        // 2. Declaração das Estruturas de Dados
        // Vetor para armazenar os nomes dos alunos (5 posições)
        String[] nomesAlunos = new String[NUM_ALUNOS];

        // Matriz para armazenar as notas e a média
        // 5 linhas (um para cada aluno) x 5 colunas (4 notas + 1 média)
        double[][] notasEMedia = new double[NUM_ALUNOS][NUM_NOTAS_PARA_MEDIA + 1];

        // Objeto para gerar números aleatórios (notas)
        Random random = new Random();

        // Objeto para ler a entrada do usuário (nomes)
        Scanner scanner = new Scanner(System.in);
        
        // Objeto para formatar a saída das médias com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("--- Processamento de Notas ---");

        // 3. Entrada de Dados (Nomes dos Alunos) e Geração das Notas
        for (int i = 0; i < NUM_ALUNOS; i++) {
            // Entrada de Dados: Pedindo o nome
            System.out.printf("Digite o nome do Aluno %d: ", (i + 1));
            nomesAlunos[i] = scanner.nextLine();

            double somaNotas = 0;

            // Geração Automática das Notas (Colunas 0 a 3 da Matriz)
            for (int j = 0; j < NUM_NOTAS_PARA_MEDIA; j++) {
                // Gera notas aleatórias entre 0.0 e 10.0 (para simular notas reais)
                // Math.random() gera [0.0, 1.0) -> Multiplica por 10.0 -> [0.0, 10.0)
                double nota = Math.random() * 10.0;
                
                // Armazena a nota na matriz (colunas 0, 1, 2, 3)
                notasEMedia[i][j] = nota;
                somaNotas += nota;
            }
            
            // 4. Cálculo da Média Aritmética
            // A média é armazenada na última coluna (índice 4)
            double media = somaNotas / NUM_NOTAS_PARA_MEDIA;
            notasEMedia[i][COLUNA_MEDIA] = media;
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
        
        System.out.println("\n--- Resultados ---");

        // 5. Impressão Organizada dos Resultados

        // Imprime o Cabeçalho da Tabela
        System.out.print("ALUNO |");
        for (int k = 0; k < NUM_NOTAS_PARA_MEDIA; k++) {
            System.out.printf(" Nota %d |", (k + 1));
        }
        System.out.println(" MÉDIA |");
        
        // Linha separadora
        System.out.print("-------|");
        for (int k = 0; k < NUM_NOTAS_PARA_MEDIA; k++) {
            System.out.print("-------|");
        }
        System.out.println("-------|");

        // Imprime os dados (Nomes e Notas/Média)
        for (int i = 0; i < NUM_ALUNOS; i++) {
            // Imprime o Nome do Aluno (vetor)
            // %-10s garante alinhamento à esquerda em um espaço de 10 caracteres
            System.out.printf(" %-10s |", nomesAlunos[i]); 

            // Imprime as Notas e a Média (matriz)
            for (int j = 0; j <= COLUNA_MEDIA; j++) {
                if (j < COLUNA_MEDIA) {
                    // Para as notas (colunas 0 a 3), formata com 2 casas decimais
                    System.out.printf(" %s |", df.format(notasEMedia[i][j]));
                } else {
                    // Para a média (coluna 4), formata com 2 casas decimais
                    System.out.printf(" %s |", df.format(notasEMedia[i][j]));
                }
            }
            System.out.println(); // Pula para a próxima linha após imprimir todos os dados de um aluno
        }
        System.out.println("---------------------------------------------------------------------");
    }
}