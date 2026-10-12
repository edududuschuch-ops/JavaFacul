import java.util.Scanner;


public class Atividade17_Temperatura {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Qual a temperatura do servidor? ");
        Double temperatura = sc.nextDouble();

        if(temperatura>85){
            System.out.print("Risco de Superaquecimento - Reduzindo Clock");
        }
        sc.close();

    }
}
