import java.util.Scanner;
public class Calculo{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double x,y;
        System.out.println("Digite 1° numero: ");
        x = leitura.nextDouble();
        System.out.println("Digite 2° numero: ");
        y = leitura.nextDouble();
        System.out.println("A soma é: "+(x+y)+" \nA subtração é: "+(x-y)+"\nA multiplicação é: "+(x*y)+"\nA divisão é: "+(x/y));
    }
}