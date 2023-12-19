import java.util.Scanner;
import java.text.DecimalFormat;
public class Situacao{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double n1,n2,n3,n4, media;
        int frequencia, porcentFreq;

        DecimalFormat notaFormat;
        notaFormat = new DecimalFormat("#.##");
        System.out.println("Digite a 1° nota: ");
        n1 = in.nextDouble();
        System.out.println("Digite a 2° nota: ");
        n2 = in.nextDouble();
        System.out.println("Digite a 3° nota: ");
        n3 = in.nextDouble();
        System.out.println("Digite a 4° nota: ");
        n4 = in.nextDouble();

        System.out.print("Digite a frequncia: ");
        frequencia = in.nextInt();

        while(frequencia > 100 || frequencia < 0) {
            System.out.println("Frequencia invalida");
            System.out.print("Digite a frequncia novamente: ");
            frequencia = in.nextInt();
        }
        
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("");
        System.out.println("A média do aluno é: "+notaFormat.format(media));
        System.out.println("Frequencia: " + frequencia);

        if (frequencia >= 75) {
            if (media >= 7 && media <= 10) {
                System.out.println("APROVADO");
            } else if (media >= 4 && media < 7) {
                System.out.println("RECUPERAÇÃO");
            } else if (media >= 0 && media < 4) {
                System.out.println("REPROVADO");
            } else System.out.println("Media invalida");
        } else {
            System.out.println("REPROVADO - Frequencia abaixo do minimo");
        }

    }
}