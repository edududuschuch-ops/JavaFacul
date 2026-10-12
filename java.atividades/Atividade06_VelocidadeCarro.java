import java.util.Scanner;


public class Atividade06_VelocidadeCarro{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print ("Registre a valocidade do carro: ");
        int velocidade = sc.nextInt();

        if(velocidade>80){
            System.out.print("Multado");

        }else{
            System.out.print("Dentro do limite");

        }
        sc.close();
    }
}