package unitconversion.unit;

/**
 * @author huisheng.jin
 * @date 2020/10/15.
 */
public class InchUnit extends Unit {
    public InchUnit() {
        super.name = INCH;
    }

    @Override
    public int convert(Unit convertUnit, int number) {
        switch (convertUnit.name) {
            case INCH:
                return number;
            case YARD:
                return number * 36;
            case FOOT:
                return number * 12;
        }
        return 0;

    }

}
