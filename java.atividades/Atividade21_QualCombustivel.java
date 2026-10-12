import java.util.Scanner;


public class Atividade21_QualCombustivel {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual combustivel você deseja, A ou G: ");
        String combustivel = sc.next();

        if(combustivel.equals("A")){
            System.out.print("Bomba 1 Ativada");
        }else if (combustivel.equals("G")){
            System.out.print("Bomba 2 Ativada");
        }
        sc.close();
    }
}
