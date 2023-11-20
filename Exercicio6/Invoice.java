package Exercicio6;

public class Invoice {
    
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;
    
    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setcodigoItem(codigoItem);
        this.setdescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
        }

    public double getInvoiceAmount(){
        return quantidade * precoUnitario;
    }


    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getquantidade(){
        return quantidade;
    }

    public void setquantidade(int quantidade){
         if (quantidade < 0 ){
            this.quantidade = 0;

        } else {
            this.quantidade = quantidade;
        }
    }

    public float getprecoUnitario(){
        return precoUnitario;
    }

    public void setprecoUnitario(float precoUnitario){
         if (precoUnitario < 0){
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }
}
