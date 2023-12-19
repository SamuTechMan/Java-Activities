public class Calc{
    public static void main(String[] args){
        double n1, n2, soma, sub, mult, div;
        String operador;
        n1 = Double.parseDouble (args[0]);
        operador = args[1];
        n2 = Double.parseDouble(args[2]);
        
        if(operador.equals("+")){
            soma = n1+n2;
            System.out.println("A soma do array das args é: "+soma);
        } else if(operador.equals("-")){
            sub = n1-n2;
            System.out.println("A soma do array das args é: "+sub);
        } else if(operador.equals("x")){
            mult = n1*n2;
            System.out.println("A soma do array das args é: "+mult);
        } else if(operador.equals("/")){
            div = n1/n2;
            System.out.println("A soma do array das args é: "+div);
        }
        
        
    }
}