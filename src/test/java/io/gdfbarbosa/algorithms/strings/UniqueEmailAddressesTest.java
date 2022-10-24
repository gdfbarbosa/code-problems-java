package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressesTest {

    @Test
    public void numUniqueEmails() {
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        assertEquals(2, uniqueEmailAddresses.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"}
        ));
    }

    @Test
    public void numUniqueEmails2() {
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        assertEquals(3, uniqueEmailAddresses.numUniqueEmails(new String[]{
                "a@leetcode.com",
                "b@leetcode.com",
                "c@lee.tcode.com"}
        ));
    }
}