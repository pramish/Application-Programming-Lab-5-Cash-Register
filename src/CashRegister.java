
import java.text.*;

public class CashRegister {

    private double cash;

    public CashRegister(double cash) {
        this.cash = cash;
    }

    public double addMoney(double money) {
        return cash = cash+money;
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }

    @Override
    public String toString() {
        if (cash == 0){
            return "Cash Register: empty";
        }
        else
        return "Cash Register: $" + formatted(cash);
    }
}
