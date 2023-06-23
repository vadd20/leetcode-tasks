package easy;

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int lastIndex = nums.length - 1;
        int middleIndex = nums.length / 2;
        int middle = nums[middleIndex];

        while (target != middle) {
            if ((startIndex == middleIndex && nums[startIndex] != target) ||
                    (lastIndex == middleIndex && nums[lastIndex] != target)) {
                return -1;
            }

            if (target < middle) {
                lastIndex = middleIndex;
                middleIndex = (startIndex + lastIndex) / 2;
            } else {
                startIndex = middleIndex;
                middleIndex = (startIndex + lastIndex + 1) / 2;
            }
            middle = nums[middleIndex];

        }
        return middleIndex;
    }
}
