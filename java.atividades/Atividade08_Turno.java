import java.util.Scanner ;


public class Atividade08_Turno {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;


        System.out. print("Me informe o seu turno, M (Manhã), N (Noite): ");
        String turno = sc.next();

        if (turno.equals("N")){
            System.out.print("Adicional noturno aplicado");
        
        }
        sc.close();


    }
}
