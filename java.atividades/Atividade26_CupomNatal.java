import java.util.Scanner;


public class Atividade26_CupomNatal {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite o Cupom de Desconto: ");
        String cupom = sc.next();

        if(cupom.equals("NATAL26")||cupom.equals("BLACKFRIDAY")){
            System.out.print("Desconto de 20% Aplicado");
        }
        sc.close();
    }
}
