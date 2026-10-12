import java.util.Scanner ;


public class Atividade01_SaqueBanco {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;

        System.out.print ("Digite o Seu Saldo Bancário: ") ;
        double saldo = sc.nextDouble() ;

        System.out.print ("Informe o valor que deseja sacar: ");
        double saque = sc.nextDouble() ;

        if (saque <= saldo) {
            System.out.print ("Saque Aprovado");
        } else {
            System.out.print ("Saldo insuficiente");
        }

        sc.close();

     }


}
