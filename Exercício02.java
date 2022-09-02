import java.util.Scanner;

public class Exercício02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço unitário do produto:");
        double preco = entrada.nextDouble();
        System.out.println("Quantidade comprada:");
        int quantidade = entrada.nextInt();
        System.out.println("Dinheiro recebido:");
        double recebido = entrada.nextDouble();


        double valorCompra = preco*quantidade;
        

        double troco = recebido-valorCompra;
        System.out.println("Troco = " + troco);

    
    }
    
}
