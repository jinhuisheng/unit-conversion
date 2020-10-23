package unitconversion;


/**
 * @author huisheng.jin
 * @date 2020/10/23.
 */
public class Length {
    private final int amount;
    private final Unit unit;
    private final int amountInInch;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
        this.amountInInch = unit.convert(amount);
    }

    @Override
    public boolean equals(Object obj) {
        return this.amountInInch == ((Length) obj).getAmountInInch();
    }

    private int getAmountInInch() {
        return amountInInch;
    }

    @Override
    public String toString() {
        return "Length{" +
                "amount=" + amount +
                ", unit='" + unit.getName() + '\'' +
                ", amountInInch=" + amountInInch +
                '}';
    }
}
