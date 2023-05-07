package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_TABLE_SIZE = 12;
    private static final int TOTAL_START_VALUE = -1;
    private static final int EMPTY_TABLE = -1;
    private static final int FULL_TABLE = NUMBERS_TABLE_SIZE - 1;
    private static final int RETURN_WITH_EMPTY_TABLE = -1;
    private final int[] numbers = new int[NUMBERS_TABLE_SIZE];

    public static int getNumbersTableSize() {
        return NUMBERS_TABLE_SIZE;
    }

    public static int getTotalStartValue() {
        return TOTAL_START_VALUE;
    }

    public static int getEmptyTable() {
        return EMPTY_TABLE;
    }

    public static int getFullTable() {
        return FULL_TABLE;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = TOTAL_START_VALUE;

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
            return RETURN_WITH_EMPTY_TABLE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_WITH_EMPTY_TABLE;
        return numbers[total--];
    }

}
