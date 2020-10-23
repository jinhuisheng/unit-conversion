package unitconversion;

/**
 * @author huisheng.jin
 * @date 2020/10/23.
 */
public class Foot {
    private int amount;

    public Foot(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Foot) obj).getAmount();
    }

    private int getAmount() {
        return amount;
    }

}
