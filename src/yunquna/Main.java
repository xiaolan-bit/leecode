package yunquna;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int v = 4;
        int[] a = {1, 2, 4, 4, 5};
        System.out.println(find(n, v, a));
    }

    public static int find(int n, int v, int[] a) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] < v) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }
}
