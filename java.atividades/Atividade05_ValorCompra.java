import java.util.Scanner ;


public class Atividade05_ValorCompra {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;

        System.out.print("Digite o valor da sua compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra>300){
            System.out.print("Frete Grátis");
        }
        else{
            System.out.print("Frete R$ 25,00");
        }
        sc.close();
    }

}