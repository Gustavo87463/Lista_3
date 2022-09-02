import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Deseja a tabuada para qual valor? ");
        int valor = entrada.nextInt();

        int i = 0;
        while(i<=10){

            int resultado = valor*i; 

            System.out.println(valor + " X " + i + " = " + resultado);
            i++;
        }
    }
    
}
