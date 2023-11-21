
package Exercicio2;


public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private float saldo;
    private String newNome;
    private float deposito;
    private float saque;

    public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    
    
    
    
    public String getAlterarNome(){
        return newNome;
    }
    
    public void setalterarNome(String newNome){
         this.newNome = newNome;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
