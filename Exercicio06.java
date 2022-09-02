import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int senhaCorreta = 2022;

        boolean i = true;
        while(i==true){
            System.out.println("Digite a senha: ");
            int senha = entrada.nextInt();

            if(senha!=senhaCorreta){
                System.out.println("Senha Inválida!");
            }else if(senha==senhaCorreta){
                System.out.println("Acesso permitido!");
                i = false;
            
            }


        }
    }
    
}
