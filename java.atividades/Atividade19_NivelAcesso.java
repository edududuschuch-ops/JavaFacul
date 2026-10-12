
import java.util.Scanner;


public class Atividade19_NivelAcesso {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual o seu nivel de acesso: ");
        String nivelAcesso = sc.next();

        if (nivelAcesso.equals("Gestor")|| nivelAcesso.equals("Admin")){
            System.out.print("Acesso ao relatório");
        }else {
            System.out.print("Acesso negado");
        }
        sc.close();
    }
}
