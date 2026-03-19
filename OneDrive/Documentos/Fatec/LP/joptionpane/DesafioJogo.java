import javax.swing.JOptionPane;
import java.util.Random;
public class DesafioJogo{
    public static void main(String[] args) {
        Random random = new Random();
 
        int sort = random.nextInt(10);
        int dig;
        do {
            dig= Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero de 1 a 10"));
        if(dig == sort){
            JOptionPane.showOptionDialog(null, "PARABÉNS, VOCÊ ACERTOU O NÚMERO", "DAVI CUNHA RODRIGUES 2º ADS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"OK!"}, "OK!");
                break;
        }else if(dig > sort){
              JOptionPane.showOptionDialog(null, "Você digitou um número maior. tente de novo", "DAVI CUNHA RODRIGUES 2º ADS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"OK!"}, "OK!");
        }else{
            JOptionPane.showOptionDialog(null, "Você digitou um número menor. tente de novo", "DAVI CUNHA RODRIGUES 2º ADS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"OK!"}, "OK!");
        }
        }while(dig != sort);
}
}
 