package ro.ghionoiu.kata;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class RomanNumeralFixture {

    public int romanToDecimal(String romanNumber) {
        Numeral numeral = Numeral.fromString(romanNumber);
        return numeral.getValue();
    }
}
