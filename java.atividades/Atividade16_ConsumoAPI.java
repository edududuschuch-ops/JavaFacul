import java.util.Scanner;


public class Atividade16_ConsumoAPI {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Quantas API foram usadas: ");
        int chamadasAPI = sc.nextInt();

        if (chamadasAPI > 1000){
            System.out.print("Plano pro Necessário");
        }
        else{
            System.out.print("Dentro do limite gratuito");
        }
        sc.close();
    }
}
