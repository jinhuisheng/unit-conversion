package unitconversion;

/**
 * @author huisheng.jin
 * @date 2020/10/20.
 */
public class Unit {
    public static Unit INCH = new Unit("inch", 1);
    public static Unit FOOT = new Unit("foot", 12);
    public static Unit YARD = new Unit("yard", 36);

    private final String name;
    private final int transferRateToInch;

    private Unit(String name, int transferRateToInch) {
        this.name = name;
        this.transferRateToInch = transferRateToInch;
    }

    int convert(int amount) {
        return this.transferRateToInch * amount;
    }

    @Override
    public String toString() {
        return name;
    }
}
