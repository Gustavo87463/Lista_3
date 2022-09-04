import java.util.Scanner;

public class Exercicio09 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
    
            System.out.println("Qual o valor do dólar? ");
            float dolar = entrada.nextFloat();
            System.out.println("Quantos dólares serão comprados? ");
            float quantidade = entrada.nextFloat();
            ConversorMoeda conversorMoeda = new ConversorMoeda(dolar, quantidade);
            conversorMoeda.Imposto(dolar, quantidade);
            
    
        }
        
    }