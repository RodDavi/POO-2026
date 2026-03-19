import javax.swing.JOptionPane;
import java.util.Random;
 
public class Atv1 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(5) + 1;
        boolean acertou = false;
 
        JOptionPane.showMessageDialog(null, " Bem-vindo ao Jogo de Apostas!\nTente adivinhar o número de 1 a 5.\nVocê tem 5 tentativas!");
 
        for (int x = 1; x <= 5; x++) {
            String input = JOptionPane.showInputDialog("Tentativa " + x + " de 5\nDigite um número entre 1 e 5:");
 
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Jogo cancelado!");
                System.exit(0);
            }
 
            int aposta = Integer.parseInt(input);
 
            if (aposta < 1 || aposta > 5) {
                JOptionPane.showMessageDialog(null, "Número fora do intervalo! Digite um número entre 1 e 5.");
                x--;
                continue;
            }
 
            if (aposta == numeroSorteado) {
                JOptionPane.showMessageDialog(null, " Parabéns! Você acertou o número " + numeroSorteado + " na tentativa " + x + "!");
                acertou = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, " Errou! Tente novamente.");
            }
        }
 
        if (!acertou) {
            JOptionPane.showMessageDialog(null, " Suas tentativas acabaram! O número era " + numeroSorteado + ".");
        }
 
        System.exit(0);
    }
}