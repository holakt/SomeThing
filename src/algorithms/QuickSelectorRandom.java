package algorithms;

/**
 * @author holate
 * @date 2021/5/19
 */
public class QuickSelectorRandom {
    public static void main(String[] args) {
        QuickSelectorRandom selectorRandom = new QuickSelectorRandom();
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            int ret = selectorRandom.select(arr, i);
            System.out.println(ret);
        }
    }

    public int select(int[] arr, int k) {
        return quickSelectRandom(arr, 0, arr.length - 1, k);
    }

    private int quickSelectRandom(int[] arr, int left, int right, int k) {
        int randomVal = (int) (left + Math.random() * (right - left + 1));
        int pivot = arr[randomVal];
        int i = left, j = right;
        while (i <= j) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else {
                swap(arr, i, j);
            }
        }
        swap(arr, randomVal, j);

        if (i - left == k) {
            return arr[j];
        } else if (i - left > k) {
            return quickSelectRandom(arr, left, j - 1, k);
        } else {
            return quickSelectRandom(arr, i, right, k - (i - left));
        }
    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
