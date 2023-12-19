import java.util.Scanner;
public class JurosProduto{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Codígo do produto: "+produto.codigoProduto+
            "\nNome do produto: "+produto.nome+
            "\nValor Unitario do produto: "+produto.valorUnitario+
            "\nQuantidade de produtos: "+produto.qtdProduto+
            "\nValor total com acréscimo de 7%: "+produto.acrescimo());
    }
}
 