import java.math.BigDecimal;

public class Deposito {

    boolean active;
    BigDecimal saldo;
    BigDecimal A;

    // this is constructor
    public Deposito(){
        this.active = false;
        this.saldo = new BigDecimal(0);
    }

    public Deposito(boolean isActive, BigDecimal saldo){
        this.active = isActive;
        this.saldo = saldo;
    }

}