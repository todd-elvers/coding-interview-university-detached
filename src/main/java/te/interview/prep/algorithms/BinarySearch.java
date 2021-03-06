package te.interview.prep.algorithms;

public class BinarySearch {
    private static final int VALUE_NOT_FOUND = -1;

    public int search(int[] sortedArray, int value) {
        if (sortedArray == null) return VALUE_NOT_FOUND;

        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            // Equivalent to (high+low)/2 but avoids possible integer overflow
            int mid = low + ((high - low) / 2);

            if (sortedArray[mid] < value) {
                low = mid + 1;
            } else if (sortedArray[mid] > value) {
                high = mid - 1;
            } else if (sortedArray[mid] == value) {
                return mid;
            }
        }

        return VALUE_NOT_FOUND;
    }

}
