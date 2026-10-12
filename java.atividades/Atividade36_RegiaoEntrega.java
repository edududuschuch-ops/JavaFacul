import java.util.Scanner;


public class Atividade36_RegiaoEntrega {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Sua região é Norte ou Sul: ");
        String regiao = sc.next();
        regiao = regiao.toUpperCase();

        int frete;

        if (regiao.equals("NORTE")){
            frete = 50;
            System.out.println("valor frete " + frete);
        }
        else if (regiao.equals("SUL")){
            frete = 30;
            System.out.println("valor frete " + frete);
        }
        sc.close();
    }
}
