package unitconversion;

import com.google.common.base.Objects;

/**
 * @author huisheng.jin
 * @date 2020/10/20.
 */
public class Length {
    private final int amount;
    private final Unit unit;
    private final int amountInInch;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
        this.amountInInch = this.unit.convert(amount);
    }

    @Override
    public boolean equals(Object o) {
        return this.amountInInch == ((Length) o).amountInInch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }

    @Override
    public String toString() {
        return amount + " (" + unit + ")";
    }
}
