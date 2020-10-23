package unitconversion;

/**
 * @author huisheng.jin
 * @date 2020/10/23.
 */
public class Unit {
    public static Unit INCH = new Unit("inch", 1);
    public static Unit FOOT = new Unit("foot", 12);
    public static Unit YARD = new Unit("yard", 36);

    private String name;
    private int transferRateInInch;

    private Unit(String name, int transferRateInInch) {
        this.name = name;
        this.transferRateInInch = transferRateInInch;
    }

    public String getName() {
        return name;
    }

    int convert(int amount) {
        return amount * transferRateInInch;
    }
}
