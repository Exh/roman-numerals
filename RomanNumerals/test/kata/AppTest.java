/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class AppTest {

    @Test
    public void value_of_I_is_1() {
        assertThat(valueOf("I"), is(1));
    }

    @Test
    public void value_of_V_is_5() {
        assertThat(valueOf("V"), is(5));
    }

    @Test
    public void value_of_X_is_10() {
        assertThat(valueOf("X"), is(10));
    }

    @Test
    public void value_of_L_is_50() {
        assertThat(valueOf("L"), is(50));
    }

    @Test
    public void value_of_C_is_100() {
        assertThat(valueOf("C"), is(100));
    }

    @Test
    public void value_of_D_is_500() {
        assertThat(valueOf("D"), is(500));
    }

    @Test
    public void value_of_M_is_1000() {
        assertThat(valueOf("M"), is(1000));
    }
    
    @Test
    public void value_is_computed_by_adding_symbols_values() {
        int valueOfSymbol1 = 1;
        int valueOfSymbol2 = 2;
        
        int computedValue = valueOfSymbol1+valueOfSymbol2;
        
        assertThat(computedValue, is(valueOfSymbol1+valueOfSymbol2));
    }
    
    @Test
    public void I_can_be_substracted_from_V() {
        String leftSymbol = "I";
        String rightSymbol = "V";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void I_can_be_substracted_from_X() {
        String leftSymbol = "I";
        String rightSymbol = "X";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void X_can_be_substracted_from_L() {
        String leftSymbol = "X";
        String rightSymbol = "L";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void X_can_be_substracted_from_C() {
        String leftSymbol = "X";
        String rightSymbol = "C";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void C_can_be_substracted_from_D() {
        String leftSymbol = "C";
        String rightSymbol = "D";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void C_can_be_substracted_from_M() {
        String leftSymbol = "C";
        String rightSymbol = "M";
        
        boolean canBePlaced = canSymbolBeSubstractedFrom(rightSymbol, leftSymbol);
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void symbol_can_be_placed_before_lower_or_equal_symbol() {
        boolean leftSymbolIsHigherOrEqualThanRightSymbol = true;
        
        boolean canBePlaced = leftSymbolIsHigherOrEqualThanRightSymbol;
        
        assertThat(canBePlaced, is(true));
    }
    
    @Test
    public void symbol_can_be_placed_before_substractable_symbol() {
        boolean leftSymbolCanBeSubstractedFromRightSymbol = true;
        
        boolean canBePlaced = leftSymbolCanBeSubstractedFromRightSymbol;
        
        assertThat(canBePlaced, is(true));
    }
    
    
    //~~~~~~~
        
    enum RomanLiteral {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
        
        int value;

        public static RomanLiteral fromString(String symbol) {
            RomanLiteral chosenLiteral = null;
            for (RomanLiteral romanLiteral : RomanLiteral.values()) {
                if (romanLiteral.name().equals(symbol)) {
                    chosenLiteral = romanLiteral;
                }
            }
            return chosenLiteral;
        }
        
        private RomanLiteral(int value) {
            this.value = value;
        }
        
        int getValue() {
            return value;
        }
    }

    
    protected int valueOf(String symbol) {
        RomanLiteral romanLiteral = RomanLiteral.fromString(symbol);
        return romanLiteral.getValue();
    }

    
    
    protected boolean canSymbolBeSubstractedFrom(String rightSymbol, String leftSymbol) {
        if ("V".equals(rightSymbol) || "I".equals(leftSymbol)) {
            return true;
        } else
        if ("X".equals(rightSymbol) || "I".equals(leftSymbol)) {
            return true;
        } else
        if ("L".equals(rightSymbol) || "X".equals(leftSymbol)) {
            return true;
        } else
        if ("C".equals(rightSymbol) || "X".equals(leftSymbol)) {
            return true;
        } else
        if ("D".equals(rightSymbol) || "C".equals(leftSymbol)) {
            return true;
        } else
        if ("M".equals(rightSymbol) || "C".equals(leftSymbol)) {
            return true;
        }
        
        return false;
    }
}