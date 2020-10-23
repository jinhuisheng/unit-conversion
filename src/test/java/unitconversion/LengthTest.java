package unitconversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/23.
 */
public class LengthTest {
    @Test
    void should_1_inch_is_1_inch() {
        Length first = new Length(1, Unit.INCH);
        Length second = new Length(1, Unit.INCH);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_1_foot_is_1_foot() {
        Length first = new Length(1, Unit.FOOT);
        Length second = new Length(1, Unit.FOOT);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_1_foot_is_12_inch() {
        Length first = new Length(1, Unit.FOOT);
        Length second = new Length(12, Unit.INCH);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_toString_format() {
        Length first = new Length(1, Unit.FOOT);
        assertThat(first.toString()).isEqualTo("Length{amount=1, unit='foot', amountInInch=12}");
    }

    @Test
    void should_1_yard_is_3_foot() {
        Length first = new Length(1, Unit.YARD);
        Length second = new Length(3, Unit.FOOT);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_1_yard_is_36_inch() {
        Length first = new Length(1, Unit.YARD);
        Length second = new Length(36, Unit.INCH);
        assertThat(first).isEqualTo(second);
    }

}
