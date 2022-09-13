package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    @Test
    public void testDuplicateShouldAssertTrue() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void testDuplicateShouldAssertFalse() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
    }
}
