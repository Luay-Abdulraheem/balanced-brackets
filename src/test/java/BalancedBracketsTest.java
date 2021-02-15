import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    private BalancedBrackets balancedBrackets;

    @Before
    public void setUp() {
        balancedBrackets = new BalancedBrackets();
    }

    @Test
    public void isBalancedBrackets() {
        assertTrue(balancedBrackets.isBalancedBrackets(null));
        assertTrue(balancedBrackets.isBalancedBrackets(""));
        assertTrue(balancedBrackets.isBalancedBrackets("()[]{}(([])){[()][]}"));
    }

    @Test
    public void isNotBalancedBrackets() {
        assertFalse(balancedBrackets.isBalancedBrackets("())[]{}"));
        assertFalse(balancedBrackets.isBalancedBrackets("[(])"));
        assertFalse(balancedBrackets.isBalancedBrackets("{([])[]]}"));
        assertFalse(balancedBrackets.isBalancedBrackets("}([])[]]}"));
    }
}
