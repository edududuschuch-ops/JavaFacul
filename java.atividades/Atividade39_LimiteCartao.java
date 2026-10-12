import java.util.Scanner;


public class Atividade39_LimiteCartao {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual o limite do cartão: ");
        double limite = sc.nextDouble();

        System.out.print("Qual o valor do Produto: ");
        double valor = sc.nextDouble();

        double saldo = limite - valor;

        if (saldo<0){
            System.out.print("transação recusada");
        }
        sc.close();
    }
}
