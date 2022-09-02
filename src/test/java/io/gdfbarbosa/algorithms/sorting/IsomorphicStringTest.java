package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.strings.IsomorphicString;
import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringTest {
    @Test
    public void testTrue() {
        IsomorphicString isomorphicString = new IsomorphicString();
        Assert.assertTrue(isomorphicString.isIsomorphic("paper", "title" ));
    }

    @Test
    public void testFalse() {
        IsomorphicString isomorphicString = new IsomorphicString();
        Assert.assertFalse(isomorphicString.isIsomorphic("foo", "bar" ));
    }
}
