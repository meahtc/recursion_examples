package edu.ti.caih313.recursion.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {

    @Test
    public void testFindMaxStraight() {
        FindMax findMax = new FindMax(new int[]{4, 6, 12, 91, 100});
        int max = findMax.findMaxStraight();
        printStats(findMax);
        assertEquals(100, max);
    }

    @Test
    public void testFindLargestValueEvenNumberOfNumsStart() {
        FindMax findMax = new FindMax(new int[]{4, 6, 12, 91});

        //Testing array with even number of elements
        int max  = findMax.findMaxHalfAtATime();
        printStats(findMax);
        assertEquals(91, max);
    }

    @Test
    public void testFindLargestValueOddNumberOfNums() {
        FindMax findMax = new FindMax(new int[]{5, 78, 43, 2, 54});

        //Testing array with odd number of elements
        int max  = findMax.findMaxHalfAtATime();
        printStats(findMax);
        assertEquals(78, max);
    }

    @Test
    public void testFindMaxStraightLots() {
        int[] longArray =
                {4, 6, 12, 91, 100,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12};
        FindMax findMax = new FindMax(longArray);
        int max = findMax.findMaxStraight();
        printStats(findMax);
        assertEquals(100, max);
    }

    @Test
    public void testFindMaxHalfLots() {
        int[] longArray =
                {4, 6, 12, 91, 100,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12,
                34, 67, 78, -3, 12};
        FindMax findMax = new FindMax(longArray);
        int max = findMax.findMaxHalfAtATime();
        printStats(findMax);
        assertEquals(100, max);
    }

    @Test
    public void testFindMaxHalfSixteen() {
        int[] longArray =
                {4, 6, 12, 91,
                34, 67, 78, -3,
                34, 67, 78, -3,
                34, 67, 78, -3};
        FindMax findMax = new FindMax(longArray);
        int max = findMax.findMaxHalfAtATime();
        printStats(findMax);
        assertEquals(91, max);
    }

    private void printStats(FindMax findMax) {
        System.out.println("Made " + findMax.getNumComparisons() + " comparisons"
        + ", in " + findMax.getNumInvocations() + " invocations.");
    }
}