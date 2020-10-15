package unitconversion.unit;

/**
 * @author huisheng.jin
 * @date 2020/10/15.
 */
public class YardUnit extends Unit {
    public YardUnit() {
        super.name = YARD;
    }

    @Override
    public int convert(Unit convertUnit, int number) {
        switch (convertUnit.name) {
            case YARD:
                return number;
            case FOOT:
                return number / 3;
            case INCH:
                return number / 36;
        }
        return 0;
    }
}
