
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestManuel {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("1+2=3")
    void testAdd() {

        int retour = calculator.add(1, 2);
        assertEquals(3, retour,"1 +2 = 3");
        // Assert

    }

    @ParameterizedTest
    @CsvSource({
            "1,-1,0"
    })
    void testAll(int a , int b,int expectedResult) {
        assertEquals(3, calculator.add(1, 2));
    }
}
