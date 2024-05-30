
/*
 * Write a method findAll that takes an array of integers and a target integer.
 * The method should return a list of all indices where the target is found in the array.
 *  If the target is not found, return -1.
Example: 
Input: array = [1, 2, 3, 2, 4, 2, 5] and target = 2	
Output: 	1,3,5

 */
public class Question1 {
    public int[] findAll(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        if (count == 0) { // if count is 0 means target not in array . return -1
            return new int[] { -1 };
        }

        int[] result = new int[count]; // array to store indices of target
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        int[] array = { 1, 2, 3, 4, 2, 5, };
        int target = 2;
        int[] indices = q1.findAll(array, target);

        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}
