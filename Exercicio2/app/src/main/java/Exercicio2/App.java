
package Exercicio2;

public class App {
    

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(0123, "Mathews",1000);
        
        conta.setalterarNome("Mathews Lima");
        
        
        System.out.println("Nome alterado para: "+ conta.getAlterarNome());
        
    }
}
