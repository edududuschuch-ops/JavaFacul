import java.util.Scanner ;


public class Atividade09_NotaFiscal {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;


        System.out.print("Qual o status da nota fiscal, Emitida, Pendente, Cancelada? ");
        String statusNF = sc.next();

        if (statusNF.equals("Emitida")){
            System.out.print("Pronta para envio");
        }
        else if (statusNF.equals("Pendente")){
            System.out.print("Aguardando pagamento");
        }
        sc.close();


        
    }
}
