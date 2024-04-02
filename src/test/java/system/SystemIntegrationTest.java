package system;

import mathfunctions.MathFunctions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SystemIntegrationTest {

    System system = new System(new MathFunctions());

    @ParameterizedTest
    @MethodSource("arguments")
    void testSystem(double x, double expected) {
        assertEquals(expected, system.system(x), 0.001);
    }

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(-4.009, -0.656),
                Arguments.of(-5.416, 0.656),
                Arguments.of(-2*Math.PI,0),

                Arguments.of(-0.5, -0.606503),
                Arguments.of(-11.48, 0.583338),
                Arguments.of(-0.1, -0.100435),
                Arguments.of(-5.22, 0.597927),
                Arguments.of(-20.91, 3.16603),
                Arguments.of(3.3, 3.39218),
                Arguments.of(1.3,0.0570412),
                Arguments.of(8.25, 1815.116),
                Arguments.of(12.99, 26072.989),
                Arguments.of(23.13, 437754.256)
        );
    }
}