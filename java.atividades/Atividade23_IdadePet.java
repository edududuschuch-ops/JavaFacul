import java.util.Scanner;


public class Atividade23_IdadePet {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual a idade do seu pet em anos: ");
        int idadePet = sc.nextInt();

        if(idadePet<=2){
            System.out.print("Filhote");
        }
        else if (idadePet<=8){
            System.out.print("Adulto");
        }
        else{
            System.out.print("Sênior");
        }
        sc.close();
    }
}
