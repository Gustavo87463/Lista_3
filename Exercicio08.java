import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);

         System.out.println("Nome:");
         String nome = entrada.nextLine();

         System.out.println("Salário Bruto:");
         double SalarioBruto = entrada.nextDouble();

         System.out.println("Imposto:");
         int Imposto = entrada.nextInt();

         double salarioLiquido = SalarioBruto-Imposto;

         System.out.println("Funcionário: " + nome + ", salario liquido: " + salarioLiquido );

        System.out.println("Qual a porcentagem para aumentar o salario?");
        double porcentagem = entrada.nextDouble();

        double aumentoSalario = (SalarioBruto*porcentagem)/100;
        
        double salarioaumentado = aumentoSalario+salarioLiquido;

        System.out.println("Dados atualizados:" + nome + ", " + salarioaumentado);


    }
}
