import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUse{
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int i;

        for(i=0; i<4; ++i){
            System.out.print("Digite alguns nomes: ");
            String nome = scan.nextLine();
            nomes.add(nome);
        }
        System.out.print(nomes);
    }
} 