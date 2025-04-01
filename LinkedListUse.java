import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListUse{
    public static void main(String[] args){
        LinkedList<String> carros = new LinkedList<String>();
        Scanner marcas = new Scanner(System.in);
        
        int i;

        for (i=0; i<4; ++i){
            System.out.println("Digite algumas marcas de carro: ");
            carros.add(marcas);
        }
        System.out.println(carros);

        while(i<4){
            System.out.print("Quer adicionar mais uma marca de carro na lista (sim) ou (nao): ");
            String escolha = scan.nextLine();
            

            if(escolha = "sim"){
                System.out.print("Digite mais uma marca de carro: ")

                carros.add(marcas);
                
            }
        }
    }
}