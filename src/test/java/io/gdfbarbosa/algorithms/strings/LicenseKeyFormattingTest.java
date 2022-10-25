package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseKeyFormattingTest {

    @Test
    public void licenseKeyFormatting1() {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void licenseKeyFormatting2() {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }

    @Test
    public void licenseKeyFormatting3() {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        assertEquals("AA-AA", licenseKeyFormatting.licenseKeyFormatting("--a-a-a-a--", 2));
    }
}