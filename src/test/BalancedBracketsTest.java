package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test   // #0
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test   // #1
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test   // #2
    public void reversedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test   // #3
    public void bracketsAroundWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }
    @Test   // #4
    public void rightBracketInWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[wo]rd"));
    }
    @Test   // #5
    public void leftBracketInWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("wo[rd]"));
    }
    @Test   // #6
    public void twoLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("w[or[d"));
    }
    @Test   // #7
    public void onlyOneLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }
    @Test   // #8
    public void extraRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]]"));
    }
    @Test   // #9
    public void nestedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[word]]"));
    }
    @Test   // #10
    public void bracketsWrongWay() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("wo]rd["));
    }
    @Test   // #11
    public void nothingAtAll() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test   // #12
    public void wordNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("word"));
    }

}
