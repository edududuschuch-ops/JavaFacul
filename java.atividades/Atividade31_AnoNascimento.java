import java.util.Scanner;


public class Atividade31_AnoNascimento {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual o ano do seu nascimento? ");
        int nascimento = sc.nextInt();

        int idade = 2026 - nascimento;

        if (idade >= 18){
            System.out.print("Pode assinar contrato");
        }
        sc.close();
    }
}
