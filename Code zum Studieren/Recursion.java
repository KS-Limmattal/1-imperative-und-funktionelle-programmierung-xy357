public class Recursion {
    
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // // Noch kürzer:
    // static int factorial(int n) {
    //     return (n <= 1) ? 1 : n * factorial(n - 1);
    // }

    static int binarySearch(int element, int[] a, int low, int high) {
        if (low > high) {
            return -1; // search interval empty, element not found
        }
        int mid = (low + high) / 2;
        if (element == a[mid]) {
            return mid;
        } else if (element < a[mid]) {
            return binarySearch(element, a, low, mid - 1);
        } else { // element > a[m]
            return binarySearch(element, a, mid + 1, high);
        }
    }

    static int binarySearch(int element, int[] a){
        return binarySearch(element, a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(binarySearch(4, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }
}
