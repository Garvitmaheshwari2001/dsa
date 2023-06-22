public class thirdLargest {
    public static int findThirdLargest(int[] arr) {
        int n = arr.length;
        
        // Check if array has at least 3 elements
        if (n < 3) {
            System.out.println("Array should have at least 3 elements");
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            
            if (current > first) {
                third = second;
                second = first;
                first = current;
            } else if (current > second && current != first) {
                third = second;
                second = current;
            } else if (current > third && current != second && current != first) {
                third = current;
            }
        }
        
        return third;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 12};
        int thirdLargest = findThirdLargest(arr);
        
        System.out.println("Third largest element: " + thirdLargest);
    }
}
