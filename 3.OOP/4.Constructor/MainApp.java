import java.math.BigDecimal;

public class MainApp{

    public static void main(String[] args){
        Deposito dep = new Deposito(true, new BigDecimal(10000));
        System.out.println(
            "status deposito " + 
            dep.active + 
            " sedangkan saldonya " + 
            dep.saldo
        );
    }
}