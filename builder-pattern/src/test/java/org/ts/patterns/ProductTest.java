package org.ts.patterns;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest extends TestCase {

    Product objectUnderTest;

    @Before
    public void setUp() throws Exception {
        objectUnderTest = new ProductBuilder().build();
    }

    public void tearDown() throws Exception {

    }

    @Test
    public void getDefaultTotalTariff() throws Exception {
        assertEquals(2.0, objectUnderTest.getSurcharge());
        assertEquals(9.99, objectUnderTest.getTariff());
        assertEquals(1.0, objectUnderTest.getTax());
        assertEquals(12.99, objectUnderTest.getTotalTariff());
    }

    @Test
    public void getTotalTariff() throws Exception {
        objectUnderTest = new ProductBuilder().withTariff(25.99).withSurcharge(1.21).build();

        assertEquals(1.21, objectUnderTest.getSurcharge());
        assertEquals(25.99, objectUnderTest.getTariff());
        assertEquals(1.0, objectUnderTest.getTax());
        assertEquals(28.2, objectUnderTest.getTotalTariff());
    }

}