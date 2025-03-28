//Usando múltiplos parâmetros
public class AulaSete {
    static void MeuMetodo(String nome, int idade){
        System.out.println(nome + ", seja bem vind@! Sua idade é: " + idade);
    }
    public void main (String[] args){
        MeuMetodo("Alleson",26 );
        MeuMetodo("Priscila", 16);
    }
}
