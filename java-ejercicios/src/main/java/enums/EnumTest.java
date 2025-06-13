package enums;

import java.util.EnumSet;

public enum EnumTest {
    ENUM_TEST1(1), ENUM_TEST2(2), ENUM_TEST3(3), ENUM_TEST4(4), ENUM_TEST5(5), ENUM_TEST6(6), ENUM_TEST7(7), ENUM_TEST8(8), ENUM_TEST9(9), ENUM_TEST10(10);
    private int value;
    private static final EnumSet<EnumTest> TEST_6_7 = EnumSet.of(ENUM_TEST6, ENUM_TEST7);

    public static boolean is6or7(EnumTest value) {
        return TEST_6_7.contains(value);
    }

    public static void method(EnumSet<EnumTest> eset) {
        if (eset.containsAll(EnumSet.of(EnumTest.ENUM_TEST1, EnumTest.ENUM_TEST2))) {
        }
        // do something.
    }

    @java.lang.SuppressWarnings("all")
    private EnumTest(final int value) {
        this.value = value;
    }
}
