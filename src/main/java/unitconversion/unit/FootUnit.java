package unitconversion.unit;

/**
 * @author huisheng.jin
 * @date 2020/10/15.
 */
public class FootUnit extends Unit {
    public FootUnit() {
        super.name = FOOT;
    }

    @Override
    public int convert(Unit convertUnit, int number) {
        switch (convertUnit.name) {
            case FOOT:
                return number;
            case INCH:
                return number / 12;
            case YARD:
                return number * 3;
        }
        return 0;
    }
}
