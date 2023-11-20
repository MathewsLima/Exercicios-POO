package Herança;
import java.util.Date;

public class main {
    
    Vendedor v = new Vendedor();
    v.setNome("Marcio");
    v.setsalario(1000.0f);
    v.setcpf("000000000");
    v.setdataNascimento(new Date());
    v.setcomissaoPorItem(10.0f);
    v.setTotalItensVendidos(10);

    System.out.print("O salário do vendedor é: " + v.calcularSalario());

    Motorista m = new Motorista();
    
}
