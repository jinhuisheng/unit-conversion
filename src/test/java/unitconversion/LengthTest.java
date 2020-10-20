package unitconversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/20.
 */
public class LengthTest {
    @Test
    void should_one_inch_is_one_inch() {
        Length first = new Length(1, Unit.INCH);
        Length second = new Length(1, Unit.INCH);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_one_foot_is_one_foot() {
        Length first = new Length(1, Unit.FOOT);
        Length second = new Length(1, Unit.FOOT);
        assertThat(first).isEqualTo(second);
    }

    @Test
    void should_one_foot_is_12_inch() {
        Length first = new Length(1, Unit.FOOT);
        Length second = new Length(12, Unit.INCH);
        assertThat(first).isEqualTo(second);
        assertThat(second).isEqualTo(first);
    }

    @Test
    void should_1_yard_is_3_foot() {
        Length first = new Length(1, Unit.YARD);
        Length second = new Length(3, Unit.FOOT);
        assertThat(first).isEqualTo(second);
        assertThat(second).isEqualTo(first);
    }

    @Test
    void should_1_yard_is_36_inch() {
        Length first = new Length(1, Unit.YARD);
        Length second = new Length(36, Unit.INCH);
        assertThat(first).isEqualTo(second);
        assertThat(second).isEqualTo(first);
    }

    @Test
    void should_display_internal_error_message() {
        Length length = new Length(1, Unit.INCH);
        assertThat(length.toString()).isEqualTo("1 (inch)");
    }
}
