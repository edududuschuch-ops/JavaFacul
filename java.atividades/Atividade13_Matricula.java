import java.util.Scanner;


public class Atividade13_Matricula {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite o Número da sua matricula: ");
        int matricula = sc.nextInt();

        if (matricula%2==0){
            System.out.print("Turma A");
        }
        else{
            System.out.print("Turma B");
        }
        sc.close();
    }
}
