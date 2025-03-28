import java.util.Scanner;
public class AulaDois {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        
        int maiorIdade = 18;
        
        if (idade >= maiorIdade) {
            System.out.println(nome + ", você é maior de idade");
        }
        else{
            System.out.println(nome + ", você não é maior de idade");
        }
        input.close();
    }
}