package unitconversion.unit;

import com.google.common.base.Objects;

/**
 * @author huisheng.jin
 * @date 2020/10/14.
 */
public abstract class Unit {
    public static final String FOOT = "foot";
    public static final String INCH = "inch";
    public static final String YARD = "yard";

    protected String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equal(this.name, unit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public abstract int convert(Unit convertUnit, int number);
}
