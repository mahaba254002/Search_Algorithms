/*
 * Write a method insertPosition that takes a sorted array of integers and a target integer.
 * The method should return the index at which the target should be inserted to maintain the sorted order.
* Example: 
* Input: array = [1, 2, 3,  5, 6, 7] and target = 4
* Output: 	3
 */

public class Question2 {
    public int insertPosition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();

        int[] array = { 1, 2, 3, 5, 6, 7 };
        int target = 4;
        System.out.println(q2.insertPosition(array, target));
    }
}
