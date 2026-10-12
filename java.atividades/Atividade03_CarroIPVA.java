import java.util.Scanner ;


public class Atividade03_CarroIPVA {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;

        System.out.print ("Informe o ano de fabricação do seu carro: ");
        int anoCarro = sc.nextInt();

        if (anoCarro<2004) {
            System.out.print("Isento de IPVA");
        }
        else{
            System.out.print("IPVA devido");

        }

        sc.close();


    }
}