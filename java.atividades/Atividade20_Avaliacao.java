import java.util.Scanner;


public class Atividade20_Avaliacao {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Deixe sua avaliação: ");
        int estrelas = sc.nextInt();

        if(estrelas<3){
            System.out.print("Pedir feedback");
        }else if(estrelas >=4){
            System.out.print("Pedir avaliação na loja");
        }
        sc.close();
    }
}
