import java.util.Scanner;


public class Atividade15_PesoBagagem {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite o peso da Bagagem: ");
        double peso = sc.nextDouble();

        if (peso<=10){
            System.out.print("Bagagem de mão livre");
        }
        else if (peso<=23) {
            System.out.print("Bagagem despachada");
        }
        else{
            System.out.print("Excesso de peso");
        }
        sc.close();
    }
}
