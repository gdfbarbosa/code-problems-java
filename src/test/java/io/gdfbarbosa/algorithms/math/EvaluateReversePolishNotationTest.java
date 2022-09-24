package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN1() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new
                EvaluateReversePolishNotation();
        assertEquals(-1, evaluateReversePolishNotation.evalRPN(new String[]{"1", "2", "-"}));
    }

    @Test
    public void evalRPN2() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new
                EvaluateReversePolishNotation();
        assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    @Test
    public void evalRPN3() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new
                EvaluateReversePolishNotation();
        assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[]{"4","13","5","/","+"}));
    }

    @Test
    public void evalRPN4() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new
                EvaluateReversePolishNotation();
        assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}