import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner e = new Scanner(System.in);

        System.out.println("Qual o valor do dolar: ");
        double dolar = e.nextDouble();
        System.out.println("Quantos dólares serão comprados? ");
        int qnt = e.nextInt();
        ConversorMoeda conv = new ConversorMoeda(dolar,qnt);
        System.out.println("Funcionário: Valor a ser pago em reais = " + conv.Imposto(dolar, qnt);
        }
    
}
