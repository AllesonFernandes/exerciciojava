import java.util.Scanner;

public class AulaOnze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("atribua um número ao i: ");
        int i = input.nextInt();
        System.out.print("atribua um número ao j: ");
        int j = input.nextInt();
        System.out.print("atribua um número ao k: ");
        int k = input.nextInt();

        int [] numbers = {i, j, k};

        for(int number : numbers){
            System.out.println(number);
        }
        input.close();
    }
    
}