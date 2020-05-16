package enums;

import org.apache.commons.lang3.EnumUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumTestTest {

    @Test
    void is6or7() {

        System.out.println(EnumUtils.isValidEnum(EnumTest.class,"ENUM_TEST1"));
        System.out.println(EnumUtils.getEnum(EnumTest.class,"ENUM_TEST1"));

    }

    @Test
    void method() {

        System.out.println(EnumUtils.isValidEnum(EnumTest.class,"ENUM_TEST1"));
        System.out.println(EnumUtils.getEnum(EnumTest.class,"ENUM_TEST1"));

    }


}
