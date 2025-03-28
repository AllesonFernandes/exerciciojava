//Usando if-else dentro de classe e usando parâmetro
public class AulaOito {
    static void MeuMetodo(int idade){
        if (idade < 18){
            System.out.println("Acesso recusado!");
        }
        else{
            System.out.println("Acesso permitido!");
    }
    }
    public void main (String[] args){
        MeuMetodo(17);
    }
}
