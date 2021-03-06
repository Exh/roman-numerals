/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.symbols;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class RomanSymbol implements Symbol {
    private final String literal;
    private final int value;
    private final Symbol substractionSymbol;

    public RomanSymbol(String literal, int value, Symbol substractionSymbol) {
        this.literal = literal;
        this.value = value;
        this.substractionSymbol = substractionSymbol;
    }

    public String getLiteral() {
        return literal;
    }

    public int getValue() {
        return value;
    }

    public boolean canSubstract(Symbol literalToSubstract) {
        boolean canSubstract = false;
        if (substractionSymbol != null) {
            canSubstract = substractionSymbol.equals(literalToSubstract);
        }
        return canSubstract;
    }

    public boolean canBePlacedBefore(Symbol rightSymbol) {
        boolean canBePlaced = false;
        if (rightSymbol.canSubstract(this)) {
            canBePlaced = true;
        } else if (this.getValue() >= rightSymbol.getValue()) {
            canBePlaced = true;
        }
        return canBePlaced;
    }
    
}
