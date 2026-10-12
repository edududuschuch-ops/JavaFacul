import java.util.Scanner;


public class Atividade04_Postagem {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int tamanho = 280;

        System.out.print ("Faça sua postagem: ");
        String postagem = sc.nextLine();
        
         if (postagem.length() > tamanho){
            System.out.print("Limite excedido");

        }else {
            System.out.print("postagem aceita");
        }
        sc.close();
        


    }

}