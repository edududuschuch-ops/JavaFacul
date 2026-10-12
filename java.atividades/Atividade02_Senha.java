import java.util.Scanner;


public class Atividade02_Senha
 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Irforme a sua senha: ");
        String senha = sc.nextLine();

         if (senha.equals("Admin2026")){
            System.out.print("Acesso Liberado");

        } else{
            System.out.print ("Acesso Bloqueado");
        }

        sc.close();

    }

}