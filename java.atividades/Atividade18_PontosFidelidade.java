import java.util.Scanner;


public class Atividade18_PontosFidelidade {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Digite a sua quantidade de pontos de fidelidades: ");
        int pontosFidelidade = sc.nextInt();

        if(pontosFidelidade>=500){
            System.out.print("Resgatar produto");
        }else{
            System.out.print("Continue comprando");
        }
        sc.close();
    }
}
