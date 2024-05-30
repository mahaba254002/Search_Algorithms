public class Search {
    public static int linearSearch(int[] arr, int target) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0; // specify index of 1st element
        int high = arr.length - 1; // specify index of last element

        while (low <= high) {
            int mid = (low + high) / 2; // gives index of middle value
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int linearData[] = { 1, 45, 7, 89, 33, 4, 76, 56, };// in linear no need sorting
        int binaryData[] = { 78, 89, 90, 101, 200, 295 };// Note data is sorted

        int results1 = linearSearch(linearData, 95);
        System.out.println("Results for linear search: " + results1);// ans -1

        int results2 = binarySearch(binaryData, 295);
        System.out.println("Results for binary search: " + results2);// ans 5

    }
}