package org.example.ky_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {
    @Test
    void testEmptyArray() {
        assertEquals(0L, Subsets.count(new Integer[]{}));
    }
    @Test
    void testSingleElem() {
        assertEquals(1L, Subsets.count(new Integer[]{ 0 }));
    }

    @Test
    void testNotRepeating() {
        assertEquals(15L, Subsets.count(new Integer[]{ 1, 2, 3, 4 }));
    }

    @Test
    void testRepeating() {
        assertEquals(127L, Subsets.count(new Integer[]{ 2, 3, 4, 5, 5, 6, 6, 7, 8, 8 }));
    }

    @Test
    void testAllIdentical() {
        assertEquals(1L, Subsets.count(new Integer[]{ 1, 1, 1, 1, 1, 1, 1, 1 }));
    }

    @Test
    void testCharacters() {
        assertEquals(511L, Subsets.count(new Character[]{ 'a', 'z', 'z', 'z', 'b', 'j', 'f', 'k', 'b', 'd', 'j', 'j', 'n', 'm', 'm' }));
    }

    @Test
    void testStrings() {
        assertEquals(511L, Subsets.count(new String[]{ "a", "z", "z", "z", "b", "j", "f", "k", "b", "d", "j", "j", "n", "m", "m" }));
    }

    @Test
    void testIntegersPerformance() {
        assertEquals(4611686018427387903L, Subsets.count(new Integer[]{ 137, 31, 88, 44, 97, 14, 80, 61, 57, 33, 135, 102, 77, 36, 93, 27, 5, 21, 120, 51, 89, 41, 125, 86, 8, 29, 24, 106, 122, 19, 12, 99, 82, 48, 108, 140, 11, 68, 114, 111, 18, 4, 129, 39, 66, 63, 54, 45, 15, 132, 92, 74, 134, 85, 95, 127, 117, 58, 124, 71, 91, 103 }));
    }
}