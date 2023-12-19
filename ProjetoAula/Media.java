import java.util.Scanner;
import javax.swing.JOptionPane;
public class Media{
    public static void main(String[] args){
            Scanner leitura = new Scanner(System.in);
            double n1,n2,n3,n4,media;
          /*  System.out.println("Digite a 1° nota ");
            n1 = leitura.nextDouble();
            System.out.println("Digite a 2° nota ");
            n2 = leitura.nextDouble();
            System.out.println("Digite a 3° nota ");
            n3 = leitura.nextDouble();
            System.out.println("Digite a 4° nota ");
            n4 = leitura.nextDouble();*/
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 1° nota")); 
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 2° nota"));
            n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 3° nota"));
            n4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 4° nota"));
            media = (n1+n2+n3+n4)/4;
            if(media >=6){
                JOptionPane.showMessageDialog(null, "A media é "+media+ "\nAprovado!!"+"\n"+"\nO Gustavo e mestre do Python");
            }else if (media < 6){
                JOptionPane.showMessageDialog(null, "A media é "+media+ "\nReprovado!!"+"\n"+"\nO Gustavo e mestre do Python");
            }
    }
}
