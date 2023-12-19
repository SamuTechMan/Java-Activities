import java.util.Scanner;
public class Cadastro{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String codAluno, nomeAluno, email, telefone, CPF;
        byte idadeAluno;
        double valMensal;

        System.out.println("Digite o codígo do Aluno: ");
        codAluno = in.next(); in.nextLine();

        System.out.println("Digite o nome do Aluno: ");
        nomeAluno = in.next(); in.nextLine();

        System.out.println("Digite a idade do Aluno: ");
        idadeAluno = in.nextByte();

        System.out.println("Digite o e-mail do Aluno: ");
        email = in.next();

        System.out.println("Digite o telefone do Aluno: ");
        telefone = in.next(); in.nextLine();

        while (telefone.length() < 11){
            System.out.println("Número Inválido!!!");
            System.out.println("Digite o telefone do Aluno: ");
            telefone = in.next(); in.nextLine();
        }

        String formatTelefone= String.format("(%s)%s%s-%s", telefone.substring(0, 2), telefone.substring(2, 3),
                telefone.substring(3, 7), telefone.substring(7, 11));

        System.out.println("Digite o CPF do Aluno: ");
        CPF = in.next();

        while(CPF.length() < 11){
            System.out.println("CPF Inválido!!!");
            System.out.println("Digite o CPF do Aluno: ");
            CPF = in.next();
        }

        String formatCPF= String.format("%s%s%s.%s%s%s.%s%s%s-%s%s", CPF.substring(0, 1), CPF.substring(1, 2),
                CPF.substring(2, 3), CPF.substring(3, 4), CPF.substring(4, 5), CPF.substring(5, 6), CPF.substring(6, 7)
            , CPF.substring(7, 8), CPF.substring(8, 9), CPF.substring(9, 10), CPF.substring(10, 11));

        System.out.println("Digite o valor da Mensalidade: ");
        valMensal = in.nextDouble();

        System.out.println("**********Cadastro do Aluno**********"+"\nCodígo: "+codAluno+
            "\nAluno: "+nomeAluno+
            "\nIdade: "+idadeAluno+
            "\nE-mail: "+email+
            "\nTelefone: "+formatTelefone+
            "\nCPF: "+formatCPF+
            "\nValor Mensalidade: R$"+valMensal+"\n-------------------------------------");
    }
}