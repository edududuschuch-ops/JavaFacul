import java.util.Scanner;


public class Atividade22_Emprestimo {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();

        System.out.print("Qual a sua Renda Mensal: ");
        double renda = sc.nextDouble();

        double parcela = emprestimo/12;
        renda = renda*0.30;

        if (parcela > renda){
            System.out.print("Recusado");
        }else{
            System.out.print("Aprovado");
        }
        sc.close();
    }
}
