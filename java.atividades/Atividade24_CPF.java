import java.util.Scanner;


public class Atividade24_CPF {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite seu CPF: ");
        String cpf = sc.next();

        if(cpf.length() != 11){
        System.out.print("CPF inválido");
        }
        else {
            System.out.print("CPF formato válido");
        }
        sc.close();
    }
}
