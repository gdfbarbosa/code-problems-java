package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RichestCustomerWealthTest {
    @Test
    public void maximumWealth1() {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(6, richestCustomerWealth.maximumWealth(new int[][]{
                {1,2,3},
                {3,2,1}
        }));
    }

    @Test
    public void maximumWealth2() {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(10, richestCustomerWealth.maximumWealth(new int[][]{
                {1,5},
                {7,3},
                {3,5}
        }));
    }

    @Test
    public void maximumWealth3() {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(17, richestCustomerWealth.maximumWealth(new int[][]{
                {2,8,7},
                {7,1,3},
                {1,9,5}
        }));
    }
}