import java.util.Scanner;
public class CadastroProduto{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String nomeProduto;
        int codProduto;
        double precoProduto;
        int qtdProduto;
        
        System.out.println("Informe o ID do produto: ");
        codProduto = in.nextInt();
        
        System.out.println("Informe o nome do produto: ");
        nomeProduto = in.next(); in.nextLine();
        
        System.out.println("Informe o preço do produto: ");
        precoProduto = in.nextDouble();
        
        System.out.println("Informe a quantidade de produto: ");
        qtdProduto = in.nextInt();
        
        System.out.println("***************Produto***************"+"\n •Codígo: "+codProduto+
        "\n •Nome: "+nomeProduto+"\n •Preço: R$"+precoProduto+"\n •Quantidade: "+qtdProduto+
        "\n-------------------------------------");
        
    }
}