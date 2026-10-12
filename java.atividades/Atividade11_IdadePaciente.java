import java.util.Scanner;


public class Atividade11_IdadePaciente {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite a Idade do Paciente: ");
        int idadePaciente = sc.nextInt();

        if (idadePaciente >= 60){
            System.out.print("Fila Prioritária");
        }
        else{
            System.out.print("Fila Comum");
        }
        sc.close();
    }
}