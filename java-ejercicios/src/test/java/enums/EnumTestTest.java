package enums;

import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumTestTest {

    private boolean isValidEnum(Class<? extends Enum> enumClass, String name) {
        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(e -> e.name().equals(name));
    }

    private <E extends Enum<E>> Optional<E> getEnum(Class<E> enumClass, String name) {
        try {
            return Optional.of(Enum.valueOf(enumClass, name));
        } catch (IllegalArgumentException | NullPointerException e) {
            return Optional.empty();
        }
    }

    @Test
    void is6or7() {
        System.out.println(isValidEnum(EnumTest.class, "ENUM_TEST1"));
        System.out.println(getEnum(EnumTest.class, "ENUM_TEST1").orElse(null));
    }

    @Test
    void method() {
        System.out.println(isValidEnum(EnumTest.class, "ENUM_TEST1"));
        System.out.println(getEnum(EnumTest.class, "ENUM_TEST1").orElse(null));
    }
}
