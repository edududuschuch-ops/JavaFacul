import java.util.Scanner;


public class Atividade12_ValidacaoIngresso {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual o código de validação do seu ingresso? ");
        String ingresso = sc.nextLine();
        String ingressoFormatado = ingresso.toUpperCase();

        if (ingressoFormatado.equals("VIP")){
            System.out.print("Acesso ao loung");


        }
        sc.close();

    }
}
