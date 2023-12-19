import java.util.Scanner;
public class Produto{
    Scanner in = new Scanner(System.in);

    int codigoProduto;
    String nome;
    double valorUnitario;
    int qtdProduto;
    double valorTotal;

    public Produto(){
        System.out.println("Digite o id do produto:");
        codigoProduto = in.nextInt();
        System.out.println("Digite o nome do produto:");
        nome = in.next();
        System.out.println("Digite o valor Unitário do produto:");
        valorUnitario = in.nextDouble();
        System.out.println("Digite a quatidade de produto:");
        qtdProduto = in.nextInt();
    }

    double acrescimo(){
        valorTotal = valorUnitario * qtdProduto;
        return this.valorTotal * 1.07;
    }
}
