import java.util.Scanner;

public class AulaUm {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println(nome);
        input.close();
    }
}