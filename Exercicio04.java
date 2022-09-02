import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        boolean i = true;

        while (i == true){
            
            System.out.println("Digite dois números:");
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if(x>y){
                System.out.println("DECRESCENTE!");
            }else if(x<y){
                System.out.println("CRESCENTE!");
            }

            if(x==y){
                i = false;
            }



            


        }

        
        

    }
    
}
