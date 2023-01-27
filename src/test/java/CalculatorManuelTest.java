
import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorManuelTest {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("1+2=3")
    void testAdd() {

        int reto
        ur = calculator.add(1, 2);
        assertEquals(3, retour,"1 +2 = 3");
        // Dos
        // Assert commentaire qui ne sert a rien
    }

    @ParameterizedTest
    @CsvSource({
            "1,-1,0"
    })
    void testAll(int a , int b,int expectedResult) {
        assertEquals(3, calculator.add(1, 2));
    }
}
