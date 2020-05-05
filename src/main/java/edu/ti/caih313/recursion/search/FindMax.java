package edu.ti.caih313.recursion.search;

public class FindMax {
    private int numComparisons = 0;
    private int numInvocations = 0;
    private final int[] arrayOfInts;

    public int getNumComparisons() {
        return numComparisons;
    }

    public int getNumInvocations() {
        return numInvocations;
    }

    public FindMax(final int[] arrayOfInts) {
        this.arrayOfInts = arrayOfInts;
    }

    public int findMaxStraight() {
       return findMaxStraight(0);
    }

    private int findMaxStraight(int startIndex) {
        numInvocations += 1;
        int endIndex = arrayOfInts.length-1;
        int max;
        if (startIndex == endIndex) {
            max = arrayOfInts[startIndex];
        } else if (endIndex == startIndex + 1) {
            max = Math.max(arrayOfInts[startIndex], arrayOfInts[endIndex]);
            numComparisons += 1;
        } else {
            int restMax = findMaxStraight(startIndex+1);
            max = Math.max(arrayOfInts[startIndex], restMax);
            numComparisons += 1;
        }
        return max;
    }

    public int findMaxHalfAtATime() {
        return findMaxHalfAtATime(0, arrayOfInts.length-1);
    }

    private int findMaxHalfAtATime(int startIndex, int endIndex) {
        numInvocations += 1;
        int max;
        if (startIndex == endIndex) {
            max = arrayOfInts[startIndex];
        } else if (endIndex == startIndex + 1) {
            max = Math.max(arrayOfInts[startIndex], arrayOfInts[endIndex]);
            numComparisons += 1;
        } else {
            int halfwayPoint = (endIndex+startIndex)/2;
            int firstHalfMax = findMaxHalfAtATime(startIndex, halfwayPoint);
            int lastHalfMax = findMaxHalfAtATime(halfwayPoint + 1, endIndex);
            max = Math.max(firstHalfMax, lastHalfMax);
            numComparisons += 1;
        }
        return max;
    }
}
