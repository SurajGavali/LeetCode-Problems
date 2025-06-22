public class BinarySearchArray {

    // Returns index if found, else returns the position where it would be inserted
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Not found, left is the insertion point
        return left;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        System.out.println(binarySearch(arr, target)); // Output: 2
        target = 2;
        System.out.println(binarySearch(arr, target)); // Output: 1 (insert position)
        target = 7;
        System.out.println(binarySearch(arr, target)); // Output: 4 (insert position)
    }
}
