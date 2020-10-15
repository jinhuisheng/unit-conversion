package unitconversion;

import unitconversion.unit.Unit;

/**
 * @author huisheng.jin
 * @date 2020/10/14.
 */
public class Length {
    private int number;
    private Unit unit;

    public Unit getUnit() {
        return unit;
    }

    public int getNumber() {
        return number;
    }

    public Length(int number, Unit unit) {
        this.number = number;
        this.unit = unit;
    }

    public boolean isEqualTo(Length length) {
        int convertValue = unit.convert(length.getUnit(), length.getNumber());
        return this.number == convertValue;
    }

    public Length convertTo(Unit unit) {
        return new Length(unit.convert(this.unit, this.number), unit);
    }
}
