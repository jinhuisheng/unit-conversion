package unitconversion;


import unitconversion.unit.FootUnit;
import unitconversion.unit.InchUnit;
import unitconversion.unit.YardUnit;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/14.
 */
public class Test {
    @org.junit.jupiter.api.Test
    void should_one_foot_is_one_foot() {
        assertThat(new Length(1, new FootUnit()).isEqualTo(new Length(1, new FootUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_one_foot_is_not_two_foot() {
        assertThat(new Length(1, new FootUnit()).isEqualTo(new Length(2, new FootUnit()))).isFalse();
    }

    @org.junit.jupiter.api.Test
    void should_one_foot_is_not_one_inch() {
        assertThat(new Length(1, new FootUnit()).isEqualTo(new Length(1, new InchUnit()))).isFalse();
    }

    @org.junit.jupiter.api.Test
    void should_one_inch_is_one_inch() {
        assertThat(new Length(1, new InchUnit()).isEqualTo(new Length(1, new InchUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_one_yard_is_one_yard() {
        assertThat(new Length(1, new YardUnit()).isEqualTo(new Length(1, new YardUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_one_foot_is_12_inch() {
        assertThat(new Length(1, new FootUnit()).isEqualTo(new Length(12, new InchUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_one_yard_is_3_foot() {
        assertThat(new Length(1, new YardUnit()).isEqualTo(new Length(3, new FootUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_3_foot_is_1_yard() {
        assertThat(new Length(3, new FootUnit()).isEqualTo(new Length(1, new YardUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_one_yard_is_36_inch() {
        assertThat(new Length(1, new YardUnit()).isEqualTo(new Length(36, new InchUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_36_inch_is_1_yard() {
        assertThat(new Length(36, new InchUnit()).isEqualTo(new Length(1, new YardUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_12_inch_is_1_foot() {
        assertThat(new Length(12, new InchUnit()).isEqualTo(new Length(1, new FootUnit()))).isTrue();
    }

    @org.junit.jupiter.api.Test
    void should_convert_foot_to_inch_success() {
        Length convertLength = new Length(1, new FootUnit()).convertTo(new InchUnit());
        assertThat(convertLength.getNumber()).isEqualTo(12);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(InchUnit.class);
    }

    @org.junit.jupiter.api.Test
    void should_convert_inch_to_foot_success() {
        Length convertLength = new Length(12, new InchUnit()).convertTo(new FootUnit());
        assertThat(convertLength.getNumber()).isEqualTo(1);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(FootUnit.class);
    }

    @org.junit.jupiter.api.Test
    void should_convert_yard_to_foot_success() {
        Length convertLength = new Length(1, new YardUnit()).convertTo(new FootUnit());
        assertThat(convertLength.getNumber()).isEqualTo(3);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(FootUnit.class);
    }

    @org.junit.jupiter.api.Test
    void should_convert_foot_to_yard_success() {
        Length convertLength = new Length(3, new FootUnit()).convertTo(new YardUnit());
        assertThat(convertLength.getNumber()).isEqualTo(1);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(YardUnit.class);
    }

    @org.junit.jupiter.api.Test
    void should_convert_yard_to_inch_success() {
        Length convertLength = new Length(1, new YardUnit()).convertTo(new InchUnit());
        assertThat(convertLength.getNumber()).isEqualTo(36);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(InchUnit.class);
    }

    @org.junit.jupiter.api.Test
    void should_convert_inch_to_yad_success() {
        Length convertLength = new Length(36, new InchUnit()).convertTo(new YardUnit());
        assertThat(convertLength.getNumber()).isEqualTo(1);
        assertThat(convertLength.getUnit().getClass()).isEqualTo(YardUnit.class);
    }


}
