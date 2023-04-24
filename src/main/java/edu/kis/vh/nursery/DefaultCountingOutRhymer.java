package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int TOTAL_START_VALUE = -1;
    public static final int EMPTY_TABLE = -1;
    public static final int FULL_TABLE = 11;
    public static final int PEEKABOO_WITH_EMPTY_TABLE = -1;
    public static final int COUNT_OUT_WITH_FULL_TABLE = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int total = TOTAL_START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_TABLE;
    }

    public boolean isFull() {
        return total == FULL_TABLE;
    }

    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_WITH_EMPTY_TABLE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return COUNT_OUT_WITH_FULL_TABLE;
        return numbers[total--];
    }

}
