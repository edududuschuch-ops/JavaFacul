import java.util.Scanner;


public class Atividade07_TentativasLogin{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Numero de tentativas de login: ");
        int tentativas = sc.nextInt();

        if (tentativas >= 3){
            System.out.print("Conta Bloqueada");
        }
        else{
            System.out.print("Tente novamente");
        }
        sc.close();
    }
}