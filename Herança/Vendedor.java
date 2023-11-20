package Herança;


public class Vendedor extends Funcionario{
    
    
    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor(){
       super();
    }

    public float calcularSalario(){
        return super.getsalario() + (this.comissaoPorItem * totalItensVendidos);
    }
   
    public int getTotalItensVendidos(){
        return totalItensVendidos;
    }
    public void setTotalItensVendidos(int totalItensVendidos){
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getcomissaoPorItem(){
        return comissaoPorItem;
    }
    public void setcomissaoPorItem(float comissaoPorItem){
        this.comissaoPorItem = comissaoPorItem;
    }

}
