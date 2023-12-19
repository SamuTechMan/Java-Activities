import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n1,n2, soma, mult;

        System.out.println("Digite o número 1: ");
        n1 = in.nextInt();
        System.out.println("Digite o número 2: ");
        n2 = in.nextInt();
        soma = n1+n2;
        mult = n1*n2;
        System.out.println("\nO resultado da soma é "+soma);
        System.out.println("O resultado da multiplicação é "+mult+"\n");
        
        if(soma %2 == 0){
            System.out.println("O número é PAR!!!");
        }else{
            System.out.println("O número é ÍMPAR!!!");
            
        } if(mult %2 == 0){
            System.out.println("O número é PAR!!!");
        }else{
            System.out.println("O número é ÍMPAR!!!");
        }
    }
}