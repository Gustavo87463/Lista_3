import java.util.Scanner;

public class Exercício01 {

    public static void main(String[] args) {

        boolean c = true;
        Scanner n = new Scanner(System.in);

        while (c == true){
            System.out.println("Nome: ");
            String nome = n.next();
            System.out.println("Valor por hora: ");
            double vh = n.nextDouble();
            System.out.println("Horas trabalhadas: ");
            int hora = n.nextInt();
            P pessoa = new P(vh, hora);

            System.out.println("O pagamento para "+nome+" deve ser "+pessoa.Salario(vh, hora));
        }

    }
}