package Aula;
public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;

    //métodos
                //tipo nome do parametro e separa com virgula cada objeto
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    //Método acessor importante para manter a segurança dos dados
    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }
}

